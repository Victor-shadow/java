package Collections;

import java.util.*;

class CollectionContainsAllMethodUsingSet {
    public static void main(String[]args){
        //Define set1 to store elements
        Set<String> set1 = new HashSet<String>();
        set1.add("Aeroplane");
        set1.add("Bus");
        set1.add("Train");
        //Define set2 to store the elements
        Set<String> set2 = new HashSet<String>();
        set2.add("Aeroplane");
        set2.add("Bus");
        set2.add("Train");
        set2.add("Boat");
        set2.add("Bicycle");

        //Define set 3 to store the elements
        Set<String> set3 = new HashSet<String>();
        set3.add("Aeroplane");
        set3.add("Bus");
        set3.add("Train");
       //Unique set1 elements
        System.out.println("unique Set1 elements: " + set1);
        //Unique set 2 elements
        System.out.println("Unique Set2 elements: " + set2);
        //prints false
        System.out.println("Is set1 containing all elements of set2:" + set1.containsAll(set2));
        //Unique set 3
        System.out.println("Unique set3 elements: " + set3);
        //prints true
        System.out.println("Is set1 containing all elements of set3: " + set1.containsAll(set3));




    }
}
