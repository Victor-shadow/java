package Collections;

import java.util.*;
//The checkedSetMethod in java.util.Collections class is used to return a dynamically typesafe view of the specified set
//The returned set will be serializable if the specified set is serializable
//Since null is considered to be a value of any reference type, the returned set permits insertion of null values whenever the backing set does

//public static Set checkedSet(Set s, class Type)
//This method takes the following parameters as arguments:
//s: the set for which a dynamically typesafe view is to be returned
//type: the type of element that is permitted to hold

//Return Value: This method returns a dynamically typesafe view of the specified set

public class CollectionsCheckedSet {
    public static void main(String[]argv) throws Exception{
        try{
            //Creating object of set type String
            Set<String> hset = new TreeSet<>();
            //Adding elements to hmap
            hset.add("Lenovo");
            hset.add("Samsung");
            hset.add("LG");

            //print the set
            System.out.println("Set: " + hset);
            //Create typesafe view of the set
            Set<String> typesafeset = Collections.checkedSet(hset, String.class);
            //Print the typesafe view of the specified list
            System.out.println("Typesafe view of the Set: " + typesafeset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
