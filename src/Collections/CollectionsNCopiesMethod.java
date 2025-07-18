//The Collections.nCopies() method is used to create an immutable list which contains multiple copies
//of the same object
//It is used to initialize a list with n copies of a given object
//The newly allocated data object is tiny; it contains a single reference to the data object
//This method is defined in the java.util.Collections class

//Syntax of Collections.nCopies() method
//public static <T> list <T> nCopies(int n, T object)
//parameters
//n:The number of copies one wants in the list
//object: The one that should be repeated
//T: The type of Object

//The method returns an immutable list with references to the same object
//The list cannot be modified since it is immutable
//if n is less than 0, it throws an IllegalArgument Exception
//The method is useful for creating pre-filled data structures

package Collections;
import java.util.*;
class CollectionsNCopiesMethod {
    public static void main(String[]args){
        //create a list with 4 copies
        List<String> array = Collections.nCopies(4, "Java is a high level oriented-programming language");
        System.out.println("The returned list is: ");
        for (String item : array){
            System.out.println(item + " ");
        }
        System.out.println();
    }

}
