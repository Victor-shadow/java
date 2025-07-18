package Collections;
import java.util.*;
import java.util.*;
//Collections.disjoint() is used to check whether two specified collections have nothing in common
//returns true if the two collections have nothing in common

class DisjointCollection {
    public static void  main(String[]args){
        List<String> array = new ArrayList<>();
        //Add Elements to the List
        array.add("Water");
        array.add("Juice");
        array.add("Wine");
        array.add("Alcohol");
        List<String> array2 = new ArrayList<>();
        //Add Elements to array 2
        array2.add("shoes");
        array2.add("bag");
        //Check if disjoint or not
        System.out.println(Collections.disjoint(array, array2));
    }


}
