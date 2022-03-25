package ejemplos.personajes;
/*
    Ejercicio
    @author: Daniel Pérez Rodríguez
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf", Integer.MAX_VALUE, Personaje.Arma.BASTON, false));
        personajes.add(new Personaje("Aragon", 88, Personaje.Arma.ESPADA, true));
        personajes.add(new Personaje("Gimli", 140, Personaje.Arma.HACHA, false));
        personajes.add(new Personaje("Legolas", 2931, Personaje.Arma.ARCO, false));
        personajes.add(new Personaje("Boromir", 41, Personaje.Arma.ESPADA, true));
        personajes.add(new Personaje("Frodo", 51, Personaje.Arma.ANILLO, false));
        personajes.add(new Personaje("Sam", 33, Personaje.Arma.ESPADA, false));
        System.out.println(personajes);

        System.out.println("\"Jovenes\" con espada:");
        personajes.stream()
                .filter(personaje -> personaje.getEdad() <= 90 && personaje.getArma().equals(Personaje.Arma.ESPADA))
                .forEach(personaje -> System.out.println(personaje));
    }
}
