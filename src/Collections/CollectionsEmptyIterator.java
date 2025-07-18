package Collections;
import java.util.*;
//The emptyIterator() method in java returns an empty iterator with no elements
//This method is immutable(One cannot do any modifications after the method has been created

//Syntax:
//Iterator<data_type> object = Collections.emptyIterator();
//where: data_type = type of iterator object
// is the data to create an iterator

//The method does not accept any parameters
//The method will not raise any exceptions
public class CollectionsEmptyIterator {
    public static void main(String[]args){
   //create an empty iterator
        Iterator<String> i = Collections.emptyIterator();
        //display the iterator
        System.out.println(i);
    }

}
