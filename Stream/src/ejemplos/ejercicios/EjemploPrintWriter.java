package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploPrintWriter {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        String nombre = "colombia.txt";
        File f = new File(ruta + nombre);
        try (PrintWriter w = new PrintWriter(f)) {
            w.println(Math.PI);
            w.printf("%.2f", Math.PI);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }
    }
}
