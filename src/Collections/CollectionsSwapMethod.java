//The swap() method of java.util.Collections class is used to swap the elements at the specified positions in the specified lists
//If the specified positions are equal then, invoking this method leaves the list unchanged
//Syntax:
//public static void swap(List list, int i, int j)
//Parameters:
//int i = The index of i element to be swapped
//int j= The index of the other element to be swapped
//list = the list which to swap elements

//Exception: This method throws IndexOfBoundsException if either i or j is out of range (i = list.size() || j = list.size() )
package Collections;
import java.util.*;
public class CollectionsSwapMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Create Object of List
            List<String> vector = new ArrayList<String>();
            //populate the vector
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
            //print the vector before swap
            System.out.println("Before swap: " + vector);
            //Swap elements
            System.out.println("\n Swapping oth and 4th element");
            Collections.swap(vector, 0 ,4);
            //Print the vector after swap
            System.out.println("\nAfter Swap: " + vector);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }
    }


}
