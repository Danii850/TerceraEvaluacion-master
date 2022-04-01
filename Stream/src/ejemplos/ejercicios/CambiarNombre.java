package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;

public class CambiarNombre {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        String nuevoNombre = "nuevo.txt";

        File f = new File(ruta + "renombrado.txt");

        boolean renombrado = f.renameTo(new File(ruta + "colombia.txt"));
        if (renombrado) {
            System.out.println("Se ha renombrado correctamente");
        } else {
            System.out.println("No se ha podido renombrar");
        }
    }
}
