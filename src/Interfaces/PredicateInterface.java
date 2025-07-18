package Interfaces;
import java.util.*;
import java.util.function.Predicate;

class PredicateInterface {
    public static void main(String[]args){
        //Create a list of strings
        List<String> n = Arrays.asList("Brussels", "Bratislava", "Integer", "Double");

        //Declare the predicate type as string and use lambda expression to create the object
        Predicate<String> object = (s) -> s.startsWith("B");

        //Iterate through the list
        for (String st: n){
            //Call the test method
            if (object.test(st)){
                System.out.println(st);
            }
        }
        
    }

}
