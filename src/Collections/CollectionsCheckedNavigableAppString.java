package Collections;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CollectionsCheckedNavigableAppString {
    public static void main(String[]args){
        //Create a navigable map
        NavigableMap<String, String> data = new TreeMap<>();
        //Insert Values into the given map
        data.put("id1", "Kenya");
        data.put("id2", "Uganda");
        data.put("id3", "SouthAfrica");

        //CREATE TYPE SAFE VIEW OF THE GIVEN MAP
        System.out.println(Collections.checkedNavigableMap(data, String.class, String.class));
    }
}
