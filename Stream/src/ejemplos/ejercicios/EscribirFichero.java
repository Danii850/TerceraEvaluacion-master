package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        String nombre = "colombia.txt";
        File f = new File(ruta + nombre);
        try{
            FileWriter escritor = new FileWriter(f);
            escritor.write("Queda menos de una semana...");
            escritor.append("\nEstoy probando si este método me lo pone en una nueva línea");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
