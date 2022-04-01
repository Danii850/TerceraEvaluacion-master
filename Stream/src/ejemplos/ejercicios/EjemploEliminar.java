package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.util.Scanner;

public class EjemploEliminar {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué fichero quieres eliminar?");
        String eliminar = sc.nextLine();

        File f = new File (ruta + eliminar);
        boolean eliminado = f.delete();
        if (eliminado) {
            System.out.println("El fichero se ha eliminado");
        } else {
            System.out.println("No se ha podido eliminar o no existe");
        }
    }
}
