package Collections;
import javax.imageio.ImageTranscoder;
import java.util.*;
//main class
public class TreeSetHeadSetMethodUnsortedSetString {
    //driver class
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add the elements using add() method
        treeSet.add("Java");
        treeSet.add("Kotlin");
        treeSet.add("Python");
        treeSet.add("Scala");
        treeSet.add("Ruby");
        treeSet.add("Rust");

        //Create the headSet
        TreeSet<String>head_set = new TreeSet<String>();
        //limit the values till 5
        head_set = (TreeSet<String>) treeSet.headSet("Rust");
        //create an Iterator
        Iterator iterator;
        iterator = head_set.iterator();

        //display the tree set data
        System.out.println("The resultant values till head set:");
        //iterating through the headSet
        while (iterator.hasNext()){
            //print the elements using next() method
            System.out.println(iterator.next() + " ");
        }


    }
}
