package ciberseguridad;

public class Resultado {
    private final String contraseña;
    private final String hash;
    private final int posicion;

    public Resultado(String contraseña, String hash, int posicion){
        this.contraseña = contraseña;
        this.hash = hash;
        this.posicion = posicion;
    }

    public String toString(){
        return "Contraseña: "+ contraseña + "\nHash: " + hash + "\nposicion: " + posicion;
    }
}
