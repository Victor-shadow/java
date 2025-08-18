/// Iterate through the elements of the HashSet using a Standard For loop / iterator


package Collections;
import java.util.*;
public class HashSetCollectionIterateElements {
    public static void main(String[]args){
        //Create a HashSet Of Strings
        HashSet<String> hashSet = new HashSet<>();
        //add elements to the set
        hashSet.add("Java");
        hashSet.add("Laravel");
        hashSet.add("Scala");
        hashSet.add("Python");
        hashSet.add("Kotlin");
        hashSet.add("Javascript");
        //use iterator method to iterate over the Set
        System.out.println("Using Iterator: ");
        Iterator<String> iterator = hashSet.iterator();
        //traverse the Iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ", ");

            System.out.println();
            //use enhanced for loop to iterate over the HashSet
            System.out.println("Using enhanced for loop : ");
            for (String element: hashSet){
                System.out.println(element + ", ");
            }
        }


    }
}
