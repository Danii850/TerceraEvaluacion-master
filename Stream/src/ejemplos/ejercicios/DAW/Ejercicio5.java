package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ruta: ");
        //"Stream\\src\\ejemplos\\ejercicios\\DAW\\Restaurantes.csv";
        String ruta = scanner.nextLine();
        File f = new File(ruta);
        boolean resultado = f.delete();
        if (resultado) {
            System.out.println("El fichero se ha borrado");
        }
    }
}
