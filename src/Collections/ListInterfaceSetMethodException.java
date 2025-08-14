package Collections;
import java.util.*;
public class ListInterfaceSetMethodException {
    public static void main(String[]args){
      try {
          //Create an ArrayList and add elements
          ArrayList<Integer> arrayList = new ArrayList<>();
          arrayList.add(1);
          arrayList.add(2);
          arrayList.add(3);
          arrayList.add(4);
          arrayList.add(5);
          //print the original array list
          System.out.println("Before operation: " + arrayList);
          //replace an element at an invalid index
          arrayList.set(7, 9);

      } catch (IndexOutOfBoundsException e){
          //handle the exception
          System.out.println("Exception: " + e);
      }
    }
}
