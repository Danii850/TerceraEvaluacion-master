package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.io.File;

public class EjemplosMkdir {
    public static void main(String[] args) {
        //mkdirs, a diferecia de mkdir te crea una una querarquía de carpetas intermadias si no existen
        String ruta = "Stream\\src\\ejemplos\\ejercicios";
        String carpetasPrimero  = "\\DAW\\Primero\\Programación";
        String carpetasSegundo  = "\\DAW\\Segundo\\Programación";

        File primero = new File (ruta + carpetasPrimero);
        boolean primeroOK = primero.mkdirs();
        if (primeroOK) {
            System.out.println("Se ha creado primero");
        } else {
            System.out.println("No se ha creado");
        }

        File segundo =  new File (ruta + carpetasSegundo);

        boolean segundoOK = segundo.mkdirs();
        if (primeroOK) {
            System.out.println("Se ha creado segundo");
        } else {
            System.out.println("No se ha creado");
        }
    }
}
