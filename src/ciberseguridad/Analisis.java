package ciberseguridad;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static ciberseguridad.HashUtils.hash256;

public class Analisis {
    Set<String> palabrasRandom;

    public Analisis(){
        this.palabrasRandom = new HashSet<>();
    }

    public void funcionMagica(){
        int faltantes = 50;
        for (int i = 1; i < 51; i++){
            long numeroAzar = ThreadLocalRandom.current().nextInt(1,100000001);
            System.out.println(i + ") "+numeroAzar);
            palabrasRandom.add(hash256(String.valueOf(numeroAzar)));
        }

        System.out.println("-------------------------\nEmpieza El Reto!");
        System.out.println("Faltan 50 contraseñas");
        for (long i = 1; i < 1000000001; i++){
            String palabra = hash256(String.valueOf(i));
            if (palabrasRandom.contains(palabra)){
                faltantes --;
                System.out.println("Faltan " + faltantes + "contraseñas");
            }
            if(faltantes == 0){
                System.out.println("LaPruebaTermino!");
                break;
            }
        }
    }
}
