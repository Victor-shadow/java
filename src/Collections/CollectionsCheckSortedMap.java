package Collections;
import java.util.*;

public class CollectionsCheckSortedMap {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of sortedMap
            SortedMap<String, Integer> smap = new TreeMap<String, Integer>();
            //Adding elements in smap
            smap.put("Rwanda", 20);
            smap.put("Kenya", 20);
            smap.put("Kuwait", 30);
            //printing sortedMap()
            System.out.println("Sorted map:\n " + smap);
            //create typesafe view of the specified map
            SortedMap<String, Integer> typesafemap = Collections.checkedSortedMap(smap, String.class, Integer.class);
            //printing typesafe view of the specified map
            System.out.println("Typesafe view of the sorted map" + typesafemap);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown at: " + e);
        }
    }

}
