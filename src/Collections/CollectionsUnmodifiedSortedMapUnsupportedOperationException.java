package Collections;
import java.util.*;

public class CollectionsUnmodifiedSortedMapUnsupportedOperationException {
    public static void main(String[]argv) throws Exception{
        try{
            //Create Object of SortedMap
            SortedMap<String, String> data = new TreeMap<String , String >();
            //populate the data
            data.put("Java", "James Gosling");
            data.put("Android", "Andy Rubin");
            data.put("C++", "Bjarne Stroustrup");
            //Make the map unmodifiable
            Map<String, String> unmodifiablemap = Collections.unmodifiableSortedMap(data);
            //print unmodifiable map
            System.out.println("unmodifiableSortedMap value: " + data);
            System.out.println("\nTrying to modify" + " the unmodifiable sorted Map");
            unmodifiablemap.put("Kotlin", "Interoperable with Java");
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }


    }
}
