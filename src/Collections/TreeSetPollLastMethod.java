/// The pollLast() method of java.util.concurrent.TreeSet is an in-built function in Java
/// which returns retrieves and removes the last(highest) element or returns null if the set is empty
/// Syntax: public E pollLast()
/// Return Value: This function returns, retrieves and removes the last(highest) element or returns null
/// if the set is empty
package Collections;
import java.util.*;
class TreeSetPollLastMethod {
    public static void main(String[]args){
        //Create a Set Obj
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add elements to this set
        for (int i = 10; i <=50; i++)
            treeSet.add(i);
        //print content of the set
           System.out.println("Content of the set: " + treeSet);
           //Retrieve and Remove the last element of the set
        System.out.println("The last element of the set; " + treeSet.pollLast());
        //print the contents of the set after pollLast
        System.out.println("The contents of the Set after pollLast: " + treeSet);

    }
}
