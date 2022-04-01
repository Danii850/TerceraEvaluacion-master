package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;

public class MoverFichero {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";

        File f = new File(ruta + "borrar.txt");

        boolean movido = f.renameTo(new File("Stream\\src\\ejemplos\\" + "borrar.txt"));
        if (movido) {
            System.out.println("Se ha movido correctamente");
        } else {
            System.out.println("No se ha movido");
        }


    }
}
