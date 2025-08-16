package Collections;
import java.util.*;
public class TreeSetDescendingSet {
    public static void main(String[]args) throws Exception{
        try {
            //Create a tree set object
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            //populate the TreeSet  using add() method
            treeSet.add(10);
            treeSet.add(20);
            treeSet.add(30);
            treeSet.add(40);
            //getting the reverse order view of the element
            //using descendingSet()method
            NavigableSet<Integer> treeReverse = treeSet.descendingSet();
            //get the iterated view of NavigableSet
            Iterator<Integer> iterator = treeReverse.iterator();
            System.out.println("\nValues using DescendingSet:");
            //printing the Integrated Value
            while (iterator.hasNext()){
                System.out.println("Value: " + iterator.next());
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
