package ejercicio1;

import java.util.List;

public final class MonthUtils {
    private MonthUtils() {
    }

    // Insert month in the list at the position index (and throw exception if the index is out of bound)
    public static void insertMonthAt(List<Month> months, int index, Month month) {
        if (index < 0 || index > months.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        months.add(index, month);
    }
}

