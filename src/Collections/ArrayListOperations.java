package Collections;
import java.util.*;
public class ArrayListOperations {
    public static void main(String[]args){
        //Create an ArrayList of String Type
        ArrayList<String> arrayList = new ArrayList<>();
        //add elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Kotlin");
        arrayList.add("Scala");
        arrayList.add("Rust");
        arrayList.add("C#");
        arrayList.add("C++");

        System.out.println("Original List: " + arrayList);
        //add an array element at the specific index
        arrayList.add(1, "Golang");

        System.out.println("After adding element at index 1: " + arrayList);
        //remove element using Index
        arrayList.remove(0);
        System.out.println("Element removed at index 0: " + arrayList);
        //remove the element using the value
        arrayList.remove("C++");

        System.out.println("Element 'C++' removed: " + arrayList);

        //update values
        arrayList.set(2, "Ruby");

        System.out.println("List after update of value: " + arrayList);

    }
}
