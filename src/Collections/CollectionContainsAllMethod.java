//The containsAll method is to check whether the collection contains all the elements present in another collection or the mentioned collection or not
//Syntax:
//boolean  containsAll(Collection<?> obj)
//Parameters: It takes Collection object as a parameter which is to be checked with the current collection
//Return value: It returns boolean value either true or false
//true if the collection object contains all the elements as in the current collection
//false if the collection objects don't match with the current collection element = if there is a single mismatch it returns false

//The number of elements in the current collection object and the compared collection object need not be the same

package Collections;
import java.util.*;
import java.io.*;
public class CollectionContainsAllMethod {
    public static void main(String[]args){
        //Define an array list to store [1,2, 3, 4, 5]
     List<Integer>list1 = new ArrayList<Integer>(Arrays.asList(1,2, 3, 4, 5));
     //Define an array list to store 1, 2, 3
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        //Define an array list to store 1, 2, 7
        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 7));
        //Print the elements
        System.out.println("List1 elements: " + list1);
        System.out.println("List2 elements: " + list2);
        //prints true because elements [1,2,3] are present in [1,2,3,4,5]
        System.out.println("Is the List1 containing all elements of List2?" + list1.containsAll(list2));
        //[1,2,7]
        System.out.println("List3 elements: " + list3);
        System.out.println("Is the List1 contains the elements of List3? " + list1.containsAll(list3));

    }
}
