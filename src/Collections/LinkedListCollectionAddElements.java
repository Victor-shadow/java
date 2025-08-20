///Adding elements: with the help of add() method one can add elements to a linked list
/// This method can perform multiple operations based on different parameters; They are
/// add(Object) - This method is used to add an element at the end of the LinkedList
/// add(int index,Object) - This method is used to add an element at a specific index of the LinkedList


package Collections;
import java.util.LinkedList;
public class LinkedListCollectionAddElements {
    public static void main(String[]args){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Kotlin");
        linkedList.add("Scala");
        linkedList.add("Python");
        linkedList.add("Rust");

        System.out.println(linkedList);
    }
}


