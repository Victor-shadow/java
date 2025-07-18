package Collections;
import java.util.*;
//the checkedSorted() method in java.util.Collections class is used to return a dynamically typesafe view of the specified sort set
//The returned sorted set will be serializable, if the specified sorted set is serializable
//since null is considered to be a value any reference type, the returned sorted set permits insertion of null elements
//whenever the backing sorted set does

//Syntax:
//public static sortedSet checkSortedSet(SortedSet s, Class type)

//Parameters
//This method takes the following arguments as parameters:
//s- the sorted set for which the dynamically typesafe view is to be returned
//type: the type of element that s is permitted to hold

//Return value
//The method returns a dynamically typesafe view of the specified sorted set

public class CollectionsCheckSortedSet {
     public static void main(String[]argv) throws Exception{
         try{
             //create object of SortedMap
             SortedSet<String> sset = new TreeSet<String>();
             sset.add("Banana");
             sset.add("Apple");
             sset.add("Orange");
             //printing sorted set
             System.out.println("Sorted set: " + sset);
             //create typesafe view of the specified sorted map
             //using checkSortedSet() method
             SortedSet<String> tset = Collections.checkedSortedSet(sset, String.class);
             //print typesafe view results
             System.out.println("Typesafe view of the sorted set: \n" + tset);
         }
         catch (IllegalArgumentException e) {
             System.out.println("Exception thrown : " + e);
         }
     }
}