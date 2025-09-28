package ejercicio1;

import java.util.Collection;
import java.util.Iterator;
// Methods to print Month collections
public class MonthPrinter {
    private MonthPrinter() {}
    public static void printCollection(Collection<Month> months, String title) {
        System.out.println(title);
        for (Month m : months) {
            System.out.println(m);
        }
        System.out.println();
    }
    public static void printWithIterator(Collection<Month> months, String title) {
        System.out.println(title);
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }


}
