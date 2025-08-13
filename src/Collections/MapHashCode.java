/// In Java, the hashCode() method  is part of the Object class and is used to generate a hash code
/// value for an object
/// The hashCode() method generates a hashCode()  based on the objects memory address or internal data
/// Syntax: public int hashCode()
/// Return type this method returns an integer value that represents the hash code of the object

/// import java.io.*;
/// class Main{
///   public static void main(String[]args){
/// Create two different objects
/// Object o1 = new Object();
/// Object o2 = new Object();
///}
/// System.out.println("Hash code of object1: " + o1.hashCode());
/// System.out.println("Hash code of object2: " + o2.hashCode());
///}

package Collections;
import java.util.*;
public class MapHashCode {
    public static void main(String[]args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Monday");
        hashMap.put(2, "Tuesday");
        hashMap.put(3, "Wednesday");

        System.out.println("Hash Map: " + hashMap);
        //display the hash code of the map
        System.out.println("HashCode of the HashMap: " + hashMap.hashCode());
    }
}
