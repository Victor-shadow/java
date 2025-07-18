package Collections;
//Java.util.Collections.frequency() method is a java.util.Collection class method. It counts the frequency of the specified
//element in the given list. It overrides the equal method to perform the comparison to check if the specified
//object and the Object in the list are equal or not
//Syntax:
//public static int frequency(Collection c, Object o)
//parameters:
//c: Collection in which to determine the frequency of o
//o: Object whose frequency is to be determined
//it throws NullPointerException if the Collection c is null
import java.util.*;

public class CollectionsForFrequency {
    public static void main(String[]args){
        //Create a list of 4 items
        ArrayList<String> list = new ArrayList<String>();
        list.add("Python");
        list.add("Java");
        list.add("Python");
        list.add("Python");
        //count the frequency of the word python
        System.out.println("The frequency of the word python is: " + Collections.frequency(list, "Python"));
    }

}
