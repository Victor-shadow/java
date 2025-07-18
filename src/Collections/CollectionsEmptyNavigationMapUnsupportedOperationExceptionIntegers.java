package Collections;

import java.util.Collections;
import java.util.SortedMap;

public class CollectionsEmptyNavigationMapUnsupportedOperationExceptionIntegers {
    public static void main(String[]args){
        SortedMap<Integer, Integer> data = Collections.emptyNavigableMap();
        //add three elements
        data.put(1, 2);
        data.put(3, 4);
        data.put(5, 6);
        //Print
        System.out.println(data);

    }
}
