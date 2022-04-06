package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        String ruta = "Stream\\src\\ejemplos\\ejercicios\\dataset_91007.txt";
        File f = new File(ruta);
        try (Scanner lector = new Scanner(f)) {
            int máximo = 0;
            while(lector.hasNextInt()) {
                int n = lector.nextInt();
                if (n > máximo){
                    máximo = n;
                }
            }
            System.out.println(máximo);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }
}
