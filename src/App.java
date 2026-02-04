import ciberseguridad.Analisis;
import ciberseguridad.BuscadorContraseñas;
import ciberseguridad.Cronometro;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Escriba el metodo que desea usar:");
            System.out.println("  java -jar JavaPOO.jar buscar");
            System.out.println("  java -jar JavaPOO.jar busquedaProfunda");
            System.out.println("  java -jar JavaPOO.jar analizar");
            return;
        }

        Cronometro c = new Cronometro();
        c.comenzar();

        switch (args[0]) {
            case "buscar":
                ejecutarBuscador();
                break;

            case "analizar":
                ejecutarAnalisis();
                break;

            case "busquedaProfunda":
                ejecutarBusquedaProfunda();
                break;

            default:
                System.out.println("Opción no válida: " + args[0]);
        }

        c.detener();
    }

    private static void ejecutarBuscador() {
        BuscadorContraseñas bc =
                new BuscadorContraseñas("Data/rockyou.txt", "Data/hashes.txt");

        try {
            bc.buscar(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ejecutarBusquedaProfunda() {
        BuscadorContraseñas bc =
                new BuscadorContraseñas("Data/rockyou.txt", "Data/hashes.txt");

        try {
            bc.buscar(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ejecutarAnalisis() {
        Analisis a = new Analisis();
        a.funcionMagica();
    }
}
