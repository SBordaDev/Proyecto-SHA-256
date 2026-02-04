package ciberseguridad;

public class Cronometro {

    private long inicio;

    public void comenzar() {
        inicio = System.nanoTime();
    }

    public void detener() {
        long fin = System.nanoTime();
        long duracionNs = fin - inicio;

        long totalMs = duracionNs / 1_000_000;

        long minutos = totalMs / 60000;
        long segundos = (totalMs % 60000) / 1000;
        long milisegundos = totalMs % 1000;

        System.out.printf("%02d:%02d:%03d%n", minutos, segundos, milisegundos);
    }
}
