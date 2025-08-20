package Collections;
import java.util.*;
public class CollectionFramework {
    public static void main(String[]args){
        //Create Instances of the array, vectors, and hashtable
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //add elements into the vector
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        //add elements into the HashTable
        hashtable.put(10,"Ten");
        hashtable.put(20, "Twenty");
        hashtable.put(30, "Thirty");
        hashtable.put(40, "Forty");
        hashtable.put(50, "Fifty");
        //access the first element of the array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(vector.elementAt(0));
        System.out.println(hashtable.get(1));


    }
}
