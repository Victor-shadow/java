//The method is used to generate the hash Code for the given list
//Syntax: int hashCode()
//Parameter: This function has no parameter
//Return value: The function returns the hash Code for the given List
package Collections;
import java.util.*;
public class ListInterfaceHashCodeMethod {
    public static void main(String[]args){
        //Initialize a List
        List<Integer> list = new ArrayList<>();
        //add elements
        list.add(10);
        list.add(20);
        //implement hash Code
        int hash = list.hashCode();

        System.out.println("Hash code for list: " + hash);


    }
}
