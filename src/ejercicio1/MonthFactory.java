package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public final class MonthFactory {
    private MonthFactory() {}
        public static List<Month> createMonthsWithoutAugust () {
            List<Month> months = new ArrayList<Month>();
            months.add(new Month("January"));
            months.add(new Month("February"));
            months.add(new Month("March"));
            months.add(new Month("April"));
            months.add(new Month("May"));
            months.add(new Month("June"));
            months.add(new Month("July"));
            // Without August months.add(new Month("August"));
            months.add(new Month("September"));
            months.add(new Month("October"));
            months.add(new Month("November"));
            months.add(new Month("December"));
            return months;
        }
    }

