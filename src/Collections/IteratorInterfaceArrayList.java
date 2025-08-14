package Collections;
import java.util.*;
public class IteratorInterfaceArrayList {
    public static void main(String[]args){
        //Create an ArrayList Object of Integer
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Add elements to the array List
        for(int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        //print the original list
        System.out.println("Original List: " + arrayList);
        //Create an iterator from the arrayList
        Iterator<Integer> iterator = arrayList.iterator();
        //Iterate through the list and remove the odd elements
        while (iterator.hasNext()){
            //Get the next element
            int next = iterator.next();

            System.out.println( next + " ");
            //remove odd elements
            if (next % 2 != 0){
                iterator.remove();
            }
        }
        //move to the next line
        System.out.println();

        //print the modified list
        //after removal of odd elements
        System.out.println("Modified list: " + arrayList);

    }
}
//We create an arrayList of integers then iterates through it using an iterator
//and removes all odd numbers
//It prints the list before and after removing the odd elements and prints the modified list
//with only even numbers