package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println("Lista1: " + list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Lista2: " + list2);
        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            Integer previous = iterator.previous();
            list2.add(previous);
        }
        System.out.println("Lista2: " + list2);
    }
}


