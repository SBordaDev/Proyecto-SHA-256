package ciberseguridad;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;
import static ciberseguridad.HashUtils.hash256;

public class BuscadorContraseñas {
    private Path rutaRockYou;
    private Path rutaObjetivo;
    private int totalFaltantes;
    private int totalEncontrados;
    public List<Resultado> encontradas;

    public BuscadorContraseñas(String rockyou, String hashes) {
        this.rutaRockYou = Path.of(rockyou);
        this.rutaObjetivo = Path.of(hashes);
        this.encontradas = new ArrayList<>();
    }

    private void procesarContraseña(String palabra, Set<String> hashesObjetivo, int posicion) {
        for (int i = 1995; i < 2026; i++) {
            String intento = palabra + i + "*";
            String hash = hash256(intento);

            if (hashesObjetivo.contains(hash)) {
                Resultado resultado = new Resultado(intento, hash, posicion);
                encontradas.add(resultado);
                hashesObjetivo.remove(hash);
                System.out.println(resultado.toString() + "\n--------------------------\n");
            }
        }
    }

    private void imprimirResultados(Set<String> hashObjetivo){
        int indice = 1;
        System.out.println("Encontrados "+ totalEncontrados +"/" + totalFaltantes);
        System.out.println("Hashes Faltantes:");
        for(String hash : hashObjetivo){
            System.out.println(indice + ") " + hash);
            indice ++;
        }
    }


    public void buscar(boolean busquedaProfunda) throws IOException {
        Set<String> hashesObjetivo = new HashSet<>(Files.readAllLines(rutaObjetivo, StandardCharsets.ISO_8859_1));
        totalFaltantes = hashesObjetivo.size();
        int posicion = 1;
        if(busquedaProfunda){
            for (String palabra : Files.readAllLines(rutaRockYou, StandardCharsets.ISO_8859_1)) {
                procesarContraseña(palabra, hashesObjetivo, posicion);
                posicion ++;
            }
            totalEncontrados = encontradas.size();
            imprimirResultados(hashesObjetivo);
        }else{
            try (Stream<String> stream = Files.lines(rutaRockYou, StandardCharsets.ISO_8859_1)) {
                Iterator<String> it = stream.limit(3000).iterator();
                while (it.hasNext()) {
                    String palabra = it.next();
                    procesarContraseña(palabra, hashesObjetivo, posicion);
                    posicion++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            totalEncontrados = encontradas.size();
            imprimirResultados(hashesObjetivo);
        }
    }
}
