package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\DAW\\cadenas.txt";
        File f = new File(ruta);
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(texto + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
