/// The forEach(BiConsumer) method of HashMap class performs the BiConsumer operation
/// on each entry of the HashMap until all entries have been processed or the action throws an Exception
/// The BiConsumer Operation is a function operation of the key-value pair of hashtable performed in the order of iteration
/// Method traverses each element of the HashTable until all the elements have been processed by the method or the exception occurs
/// Exceptions thrown by the Operation are passed to the caller:
/// Syntax: public void forEach(BiConsumer action)
/// Parameter: This method accepts a parameter action of BiConsumer type that represents what actions are to be performed on HashMap elements
/// Return: This method does not return anything
/// This method throws NullPointerException if the action is null


package Collections;
import java.util.*;
import java.util.function.BiConsumer;

public class HashMapForEachBiConsumerMethod {
    //main method
    public static void main(String[]args){
        //Create a HashMap and add some values
        Map<String,Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Kotlin", 20);
        map.put("C++", 30);
        map.put("C#", 40);
        map.put("Python", 50);
        map.put("Rust",60);
        //Create a Custom Action
        BiConsumer<String,Integer> action = new MyBiConsumer();

        //call for each method
        map.forEach(action);
    }
}
//define action in BiConsumer class
class MyBiConsumer implements BiConsumer<String,Integer> {
    public void accept(String k, Integer v){
        System.out.println("Key = " + k);
        System.out.println("\t Value = " + v);
        System.out.println();
    }
}
