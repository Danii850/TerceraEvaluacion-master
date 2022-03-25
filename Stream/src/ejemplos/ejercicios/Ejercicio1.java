package ejemplos.ejercicios;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            lista.add((int) (Math.random() * 15 + 1));
        }

        //e. Imprime sólo los mayores o iguales a 5, ordenados.
        System.out.println("\ne.");
        lista.stream()
                .filter(n -> n >= 5)
                .sorted()
                .forEach(n -> System.out.println(n + " "));
        //f. Imprime sólo los mayuores o iguales a 5, ordenados inversamente.
        System.out.println("\nf.");
        lista.stream()
                .filter(n -> n >= 5)
                .sorted((n1, n2) -> n2 - n1)
                .forEach(n -> System.out.println(n + " "));
        //g. Suma todos los elementos de la lista.
        System.out.println("\ng.");
        int suma = lista.stream()
                .reduce(0, (comparador, elemento) -> comparador + elemento);
        System.out.println("Suma = " + suma);
        //h. Suma todos los elementos mayores o iguales a 5.
        System.out.println("\nh.");
        suma = lista.stream()
                .filter(n -> n >= 5)
                .reduce(0, (acumulador, elemento) -> acumulador + elemento);
        //i. Calcula el promedio de todos los elementos de la lista.
        System.out.println("\ni.");
        int numerador = lista.stream().reduce(0, (a, b) -> a +b);
        double denominador = lista.stream().count();
        System.out.println("Promedio: " + (numerador / denominador));
    }
}
