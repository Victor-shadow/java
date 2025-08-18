/// The HashSet remove() method in Java is used to remove a specified element from the set if it is present
///
package Collections;
import java.util.*;
public class HashSetRemoveMethod {
   public static void main(String[]args){
       //Create a HashSet
       HashSet<Integer> hashSet = new HashSet<>();
       //add elements into the HashSet
       hashSet.add(100);
       hashSet.add(200);
       hashSet.add(300);
       hashSet.add(400);
       hashSet.add(500);

       System.out.println("Original HashSet: " + hashSet);

       hashSet.remove(200);
       System.out.println("HashSet after removal: " + hashSet);
   }
}
