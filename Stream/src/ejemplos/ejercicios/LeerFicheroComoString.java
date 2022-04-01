package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerFicheroComoString {
    public static void main(String[] args) {
        //Leer to-do el texto de un archivo como una sola cadena
        String ruta = "Stream\\src\\ejemplos\\ejercicios\\";
        String nombre = "OtroEjemploExcepciones.java";

        //Declaro un String donde voy a guardar to-do el contenido del fichero


        //y luego lo instancio y en el constructor escribo: String(Files.readAllBytes(Panths.get(ruta))
        try{
        String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
