package Collections;
import java.util.*;
public class StackClass {
    //main method
    public static void main(String[]args){
        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("Kotlin");
        stack.push("Scala");
        stack.push("Rust");
        stack.push("Python");
        stack.push("Javascript");


        //Iterator for the stack
        Iterator<String> iterator = stack.iterator();
        //print the stack
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        stack.pop();

        //Iterator for the Stack
        iterator = stack.iterator();
        //print the stack
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
