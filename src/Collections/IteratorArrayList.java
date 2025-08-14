package Collections;
import java.util.*;
public class IteratorArrayList {
    public static void main(String[]args){
        //Create an ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        //Obtain an Iterator from the array list
        Iterator<String> iterator = arrayList.iterator();
        //Iterate through the elements and print each one
        while (iterator.hasNext()){
            //get the next element
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
