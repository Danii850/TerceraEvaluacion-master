package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\DAW\\Restaurantes.csv";
        File f = new File(ruta);
        try (Scanner lector = new Scanner(f)) {

            int tamañoMayor = 0, tamañoMenor = 1000;
            String lineaMasLarga, lineaMasCorta;

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                if (linea.length() > tamañoMayor) {

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }
}
