package Collections;

import java.util.Collections;
import java.util.SortedMap;

public class CollectionsEmptyNavigationMapUnsupportedOperationException {
    public static void main(String[]args){
        //Create an empty navigable map
        SortedMap<String, String > data =Collections.emptyNavigableMap();
        //Add 3 elements
        data.put("1", "kyiv");
        data.put("2", "Tashkent");
        data.put("3", "Dushanbe");
        //print result
        System.out.println(data);
    }
}
