/// The contains(E e) method of Deque Interface is used to check for the presence of the element e in the Deque container
/// If the Deque contains one occurrence of the element, then it returns true, else it returns false
/// Syntax: boolean contains(Object o)
/// Parameters: This method accepts a mandatory parameter o which is the element that needs to be tested if it is present
///in the deque or not
///Return Value: This method returns True if the element is present in the deque otherwise it returns false
/// Exception: This function throws two Exceptions:
/// i ClassCastException: If the type of the specified element is incompatible with the deque It is optional
/// ii NullPointerException:  If the specified element is null and the Deque does not permit null elements


package Collections;
import java.util.*;
public class DequeInterfaceContainsMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create an Empty Deque
        Deque<String> de_que = new LinkedList<String>();
        //add elements into the Deque
        de_que.add("Java");
        de_que.add("Kotlin");
        de_que.add("C#");
        de_que.add("C++");
        de_que.add("Python");

        //Display the Deque
        System.out.println("Deque: " + de_que);
        //check for "Kotlin" in the deque
        System.out.println("Does the Deque contain 'Kotlin'? " + de_que.contains("Kotlin"));
        //check if the "Java" is in the deque
        System.out.println("Does the Deque contain 'Java'? " + de_que.contains("Java"));
        //check if the 'Javascript' is contained in the Deque
        System.out.println("Does the deque contain 'Javascript'? " + de_que.contains("Javascript"));

    }
}
