package nivel2Ejercicio2;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[]arg){
        HashSet<Restaurants> restaurants = new HashSet<>();

      restaurants.add(new Restaurants("Jaica", 5));
      restaurants.add(new Restaurants("Disfrutar", 5));
      restaurants.add(new Restaurants("La Bendita", 4));
      restaurants.add(new Restaurants("La Bendita", 4));
      restaurants.add(new Restaurants("La Bendita", 5));
      restaurants.add(new Restaurants("jaica", 5));
      restaurants.add(new Restaurants("DISFRUTAR", 5));

      restaurants.forEach(System.out::println);

      List<Restaurants> list = new ArrayList<>(restaurants);
      Collections.sort(list);
      System.out.println(list);

    }
}
