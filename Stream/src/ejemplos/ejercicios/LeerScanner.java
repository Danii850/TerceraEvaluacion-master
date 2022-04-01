package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        File f = new File (ruta + "colombia.txt");

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println("linea a linea");
                System.out.println(sc.nextLine());
            }
            sc = new Scanner(f);
            while (sc.hasNextInt()) {
                System.out.println("Número a número");
                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero" + e.getMessage());
        }
    }
}
