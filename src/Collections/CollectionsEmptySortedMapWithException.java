package Collections;
import java.util.*;

public class CollectionsEmptySortedMapWithException {
    public static void main(String[] args) {
    SortedMap<String, String> data = Collections.emptySortedMap();
    //Add three elements
    data.put("1","Java");
    data.put("2","Kotlin");
    data.put("3","C++");

    System.out.println(data);
}
}
