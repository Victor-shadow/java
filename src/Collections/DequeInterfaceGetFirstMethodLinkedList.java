///The getFirst() method of the Deque interface returns the first element or the head of the deque
/// It does not delete the element. It throws an Exception when the deque is empty
/// Syntax E getFirst()
/// Parameters: This method does not accept any parameter
/// Return: This method returns the first element or the head of the Deque but does not delete it
/// The function throws NoSuchElementException when the deque is empty and the function is invoked

package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceGetFirstMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the Deque
        deque.add(111);
        deque.add(222);
        deque.add(333);
        deque.add(444);
        //print Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque Head: " + deque.getFirst());
    }
}
