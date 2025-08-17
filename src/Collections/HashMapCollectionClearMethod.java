/// The clear() method of the HashMap class in Java is used to remove all of the elements or mappings
/// (key-value) pairs from a specified HashMap
/// Syntax of HashMap clear method: public void clear()
/// Parameters: This method does not accept any parameter
/// Return value: This method does not return any value

package Collections;
import java.util.*;
public class HashMapCollectionClearMethod {
    public static void main(String[]args){
        //Create a HashMap and add Key-value Pairs
        HashMap<Integer,String> hashMap =new HashMap<>();
        hashMap.put(10, "Ten");
        hashMap.put(20, "Twenty");
        hashMap.put(30, "Thirty");
        hashMap.put(40, "Forty");
        hashMap.put(50, "Fifty");
        //print the initial HashMap
        System.out.println("Initial HashMap: " + hashMap);
        //clear the HashMap
        hashMap.clear();
        //print the HashMap after clearing
        System.out.println("After clear(): " + hashMap);
    }

}
