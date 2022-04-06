package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

    String rutaOrigen = "Stream\\src\\ejemplos\\ejercicios\\DAW\\Restaurantes.csv";
    File origen = new File(rutaOrigen);

    String rutaDestino = "Stream\\src\\ejemplos\\ejercicios\\DAW\\Restaurantes.csv";
    File destino = new File(rutaDestino);

    try {
        Scanner lector = new Scanner(origen);
        FileWriter fw = new FileWriter(destino, true);
        String linea;
    } catch (Exception e) {

    }
    }
}
