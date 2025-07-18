package Collections;

import java.util.*;
//the checkedSortedMap() method of java.util.Collections class is used to return a dynamically typesafe view
//of the specified sort map
//The returned map will be serializable if the specified map is serializable
//Since null is considered to be a value of any reference type, the returned map permits insertion of the null keys and
//values when the backing map does

//Syntax:
//public static sortedMap checkedSortedMap(SortedMap m, Class keyType, Class valueType)

//parameters
//This method takes the following arguments as a parameter:
// m - the map for which a dynamically typesafe view  is to be returned
//keyType - the type of key that m is permitted to hold
//valueType - type of value that m is permitted to hold

//Return Type
//This method returns a dynamically typesafe view of the specified map

public class CollectionsCheckedSortedMapMethod {
    public static void main(String[] argv) throws Exception {
        try {
            // 🚀 Create a SortedMap using TreeMap
            SortedMap<String, String> object = new TreeMap<>();

            // 📦 Add elements to the SortedMap
            object.put("Russia", "Guinea");
            object.put("Kuwait", "Armenia");
            object.put("Kiribati", "Vienna");

            // 🖨️ Print the original SortedMap
            System.out.println("Sorted map:\n" + object);

            // ✅ Create a typesafe (checked) view of the sorted map
            SortedMap<String, String> smap = Collections.checkedSortedMap(object, String.class, String.class);

            // 🖨️ Print the typesafe view
            System.out.println("Typesafe view of the sorted map:\n" + smap);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}