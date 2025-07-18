//Overloaded toArray() method
//This overloaded method of toArray() returns an array containing all elements inside the collection where the type of returned array is what is specified inside the argument
//of the toArray method

//Syntax
//<T> T[]  toArray(T[]arr)

//Parameter = t denotes the type of element stored in the collection
//Return type: The return type is what is specified inside the argument(T)


//the major advantage of using the overloaded toArray() method is it provides compile-time type safety as it returns an array of a specific type(String, Integer) having the same size and containing all the elements


package Collections;
import java.io.*;
import java.util.*;

 class CollectionOverloadedToArrayMethod {
    public static void main(String[]args){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String[] array = list.toArray(new String[0]);

        System.out.println("The Array contains:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }



    }
}
