package ejercicio1;

import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
// Convert to Collections
public final class CollectionUtils {
    private CollectionUtils() {}

        public static Set<Month> toHashSet (Collection<Month> months){
            return new HashSet<>(months);
        }
    }

