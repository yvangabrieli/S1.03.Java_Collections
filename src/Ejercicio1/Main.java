package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));
        //months.add(new Month("Agosto")); // We will add it later.
        months.add(new Month("Septiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));

        months.add(7, new Month("Agosto")); // Add Agosto on his position

        for (Month m : months) {
            System.out.println(m);
        }
        System.out.println("--------------------------------------");
        HashSet<Month> monthsSet = new HashSet<Month>(); // Convert the ArrayList to HashSet (NO DUPLICATIONS)
        monthsSet.add(new Month("Enero"));  // Try to add a duplicate
        for (Month m : months) {
            System.out.println(m);
        }
        System.out.println("--------------------------------------");
        System.out.println("Run classic For loop");
        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }
        System.out.println("--------------------------------------");
        System.out.println("Run For loop with iterator");
        Iterator<Month> iter = months.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}