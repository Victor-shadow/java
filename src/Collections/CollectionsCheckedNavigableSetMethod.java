package Collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionsCheckedNavigableSetMethod {
    public static void main(String[]args){
        //Create a set of string type
        NavigableSet<Integer> data = new TreeSet<>();
        //Insert the values into the data set
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);

        //typesafe view of the set
        System.out.println(Collections.checkedNavigableSet(data, Integer.class));
    }
}
