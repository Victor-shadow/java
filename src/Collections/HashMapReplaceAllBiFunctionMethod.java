/// The replaceAll(BiFunction) method of HashMap class replaces each value with the result of applying the given function
/// (performs a certain operation) on the corresponding value
/// The process continues in the same manner until all entries have been processed or until an exception is thrown
/// by the function
/// It rethrows exceptions thrown by the replacement function
/// Syntax: default void replaceAll(BiFunction<K, V> function)
/// Parameter: BiFunction: Function to do the operation on value for each entry
/// Return value; replaces calculated values in  place and the method returns nothing but Exceptions:
/// i)ClassCastException: throws to indicate that the replacement class attempted to cast an object to a subclass which is of type
/// not acceptable by this map* When one tries to cast an Integer to a String, String is not a subclass of Integer, a ClassCastException will be thrown
/// ii)ConcurrentModificationException: occurs when an object is  to be modified or removed simultaneously when iterated over
/// *It is not permissible for a thread(independent path of execution within a program)to modify a Collection
/// when some other thread is iterating over it. The reason why this happens is the result of the above operation becomes undefined
/// iii)IllegalArgumentException: when some property of the replacement value has been passed as an illegal or inappropriate argument
/// and so prevents it from being stored in the map. If a method requires a non-empty string as a parameter and the input string equals
/// to null, The IllegalArgumentException is thrown
/// iv)NullPointerException: when the given function points to null or newValue has not been initialized yet and hence refers to null
/// it throws a NullPointerException; Calling the instance method on a null object
/// v)UnsupportedOperationException: thrown to indicate that the requested operation is not supported by this map
/// In an ArrayList Class if one uses add or remove method UnsupportedOperationException is thrown


package Collections;
import java.util.*;
public class HashMapReplaceAllBiFunctionMethod {
    //Main method
    public static void main(String[]args){
        //Create a HashMap having some entries
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("Key2", 2);
        hashMap.put("Key3", 3);
        hashMap.put("Key4", 4);
        hashMap.put("Key5", 5);
        //print Map details
        System.out.println("HashMap: " + hashMap.toString());
        //replace oldValue with  square of oldValue(newValue)
        //using replaceAll method
        hashMap.replaceAll((key, oldValue) -> oldValue*oldValue);
        //print new mapping
        System.out.println("New HashMasp: " + hashMap);


    }
}
