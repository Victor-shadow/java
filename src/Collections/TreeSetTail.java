package Collections;
import java.util.*;
public class TreeSetTail {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        //add the elements using add() method
        tree_set.add(9);
        tree_set.add(2);
        tree_set.add(100);
        tree_set.add(40);
        tree_set.add(50);
        tree_set.add(10);
        tree_set.add(20);
        tree_set.add(30);
        tree_set.add(15);
        tree_set.add(16);
        //Create the tail_set tree
        TreeSet<Integer> tail_set = new TreeSet<Integer>();
        //limit the values till 5
        tail_set =(TreeSet<Integer>)tree_set.tailSet(25);
        //Create an Iterator
        Iterator iterator;
        iterator =tail_set.iterator();
        //Display the TreeSet data
        System.out.println("The resultant values from the tail");
        //Iterate through the tail set
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }
}
