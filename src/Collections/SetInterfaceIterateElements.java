package Collections;
import java.util.*;
public class SetInterfaceIterateElements {
    public static void main(String[]args){
        //Create object of type Set and declare String
        Set<String> set =  new HashSet<String>();
        //add elements to the set
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("E");
        //Iterate through the set through the for-each loop
        for (String value: set){
            //Print all the values inside the Set object
            System.out.println(value + " ,");
            System.out.println();
        }


    }
}
