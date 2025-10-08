package nivel2Ejercicio1;

import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("Selva", 8));
        restaurants.add(new Restaurant("Mr. Porter", 7));
        restaurants.add(new Restaurant("Il Palato", 9));
        restaurants.add(new Restaurant("Selva", 8));
        restaurants.add(new Restaurant("Mr. Porter", 10));
        restaurants.add(new Restaurant("Mr. Porter", 10));
        restaurants.forEach(s -> System.out.println(s));

    }
}

