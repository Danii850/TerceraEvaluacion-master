package ejemplos.personajes;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

public class Personaje {
    private String nombre;
    private int edad;
    private Arma arma;
    boolean esHumano;

    public enum Arma {ESPADA, HACHA, ARCO, BASTON, ANILLO}

    public Personaje(String nombre, int edad, Arma arma, boolean esHumano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.esHumano = esHumano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public boolean isEsHumano() {
        return esHumano;
    }

    public void setEsHumano(boolean esHumano) {
        this.esHumano = esHumano;
    }

    @Override
    public String toString() {
        return nombre + "(" + edad +
                ") arma: " + arma +
                "; esHumano" + (esHumano?" es humano":" no es humano");

    }
}
