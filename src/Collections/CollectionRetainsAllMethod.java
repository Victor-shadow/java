//The retainAll method of Java collection retains or keeps only those elements present inside the collection which is given as an argument to the function

//Syntax:
//boolean retainAll(Collection<?> c)
//Parameters: c is The collection containing all elements retained or kept by the calling collection
//Return Type
//It returns a boolean value . It returns true if the calling collection is modified(any of the elements is removed) and returns false if no elements are removed

//Exception
//NullPointerException = If the collection is null or holds one or more elements as null and the invoked collection does not allow null elements
//UnsupportedOperationException = If the retainAll() is not supported by the collection
//ClassCastException = If the elements are not mutually comparable i.e. you have a mix of different object types. this exception can occur when trying to  compare the elements

//Example of Collection retainAll method
//The retainAll() method modifies the calling collection, and it removes those elements that are not present in the collection passed as an argument to the function
//Essentially, it retains or keeps only those elements that are common between two collections

//For each element in the calling collection,it checks whether it exists in the collection c(collection passed as an argument).
//If any element is found in the collection c then it retains the element in the collection
//If any element is not found in the collection c then it removes the element from the calling collection
//After the whole process is done,  the calling collection remains only with the elements that are common between the two collections
//If the calling collection is modified, then it returns true otherwise false

package Collections;
import java.util.*;
import java.io.*;
public class CollectionRetainsAllMethod {
    public static void main(String[]args){
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     list1.add(5);

     ArrayList<Integer> list2 = new ArrayList<Integer>();
     list2.add(100);
     list2.add(2);
     list2.add(300);
     list2.add(4);

     //print the list
        System.out.println("Original List: " + list1);
        System.out.println("List containing the elements to be retained by the calling collection: " + list2);
        //Retains or keeps elements only those specified inside the collection
        boolean modified = list1.retainAll(list2);
        System.out.println("Calling Collection Modified: " + modified);
        System.out.println("Original List (Elements Retained): " + list1);
    }
}
