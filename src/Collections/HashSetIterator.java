/// The HashSet iterator() method in Java is used to return an iterator that can be used to iterate over the elements
/// in the HashSet
/// A HashSet does not maintain any specific order of elements, so the elements are returned in a random order the way they
/// were iterated over
/// The iterator method provides a way to traverse over the elements in the set, allowing  one to access them one by one
/// Syntax: public iterator<E> iterator();
/// Return type: This method returns an iterator  object to traverse the elements in the collection one by one

package Collections;
import java.util.*;
public class HashSetIterator {
    public static void main(String[]args){
        //Create a HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        //add elements to the HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        //get the iterator
        Iterator<Integer> iterator = hashSet.iterator();
        //traverse the HashSet using an Iterator
        System.out.println("HashSet: " + hashSet);
        System.out.println("The iterator values are: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
