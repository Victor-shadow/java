package Collections;
import java.util.*;
//The copy() method of Collection classis used to copy all the elements from one list to another
//After the operation, the index of each copied element in the destination list will be identical to the index
//in the source list
//The destination list must be at least as long as the source list. If it is longer the remaining elements in the destination list
//are unaffected
public class CopyingElementsCollection {
    public static void main(String[]args){
        List<String> array = new ArrayList<>();
        //Add the elements
        array.add("Apple");
        array.add("Orange");
        array.add("Pineapple");
        array.add("Tomato");

        //Print the elements
        System.out.print("The Original Destination List is: ");
        for (int i = 0; i < array.size(); i++){
            System.out.println(  array.get(i)+" ");
        }
        System.out.println();

        //Create source List
        List<String> array2 = new ArrayList<>();
        //Add Elements
        array2.add("Spinach");
        array2.add("Lettuce");
        array2.add("Cauliflower");

        //Copy the elements from source 1 to source 2
        Collections.copy(array, array2);
        //Print the modified list
        System.out.println("The Destination list after copying: ");
        for (int i =0; i < array2.size(); i++){
            System.out.println(array2.get(i) + " ");
        }

    }

}
