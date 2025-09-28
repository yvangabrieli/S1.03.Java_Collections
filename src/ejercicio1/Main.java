package ejercicio1;

import java.util.Collections;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        // Make the list without August
        List<Month> months = MonthFactory.createMonthsWithoutAugust();
        System.out.println(months);
        System.out.println();

        // Insert August at the correct position
        MonthUtils.insertMonthAt(months, 7, new Month("August"));

        // Arraylist shown in order
        MonthPrinter.printCollection(months, "List in order (Arraylist)");
        System.out.println();

        // Convert to HashSet and Show (eliminate duplicate and no order guarantee)
        Set<Month> monthSet = CollectionUtils.toHashSet(months);
        MonthPrinter.printCollection(monthSet, "List of months (HashSet) - No duplicates: ");
        System.out.println();

        // Try to duplicate and show the result that is no duplicate
        boolean added = monthSet.add(new Month("January"));
        System.out.println("Try to add January to the hashset" + (added ? " (Duplicate)" : " (No duplicate)"));
        System.out.println();

        // insert  the HashSet with Iterator
        MonthPrinter.printWithIterator(monthSet, "HashSet with Iterator");

        // Show the List with classic For loop
        System.out.println("Classic For Loop");
        for (int i = 0 ; i  < months.size(); i++) {
            System.out.println(months.get(i));
        }
        System.out.println();
    }
}
