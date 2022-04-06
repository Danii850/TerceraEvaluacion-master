package ejemplos.ejercicios.DAW;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\DAW\\cadenas.txt";
        String[] resultado = devolverCadena(ruta);
        Arrays.stream(resultado).forEach(cadena -> System.out.println(cadena));
    }

    public static String[] devolverCadena(String ruta) {
        String[] cadenas = null;
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            cadenas = contenido.split("\\*");
        } catch (IOException e){
            System.out.println("Ha ocurrido un problema: " + e.getMessage());
        }
        return cadenas;
    }
}
