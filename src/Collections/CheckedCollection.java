package Collections;
import java.util.*;


public class CheckedCollection {
    public static void main(String[]argv) throws Exception{
        //try block to check for exceptions
        try{
            //Creating an empty array list by creating object of list of String Type
            List<String> array = new ArrayList<String>();
            //Adding Elements to array list using add() methods
            array.add("PHP");
            array.add("Java");
            array.add("HTML");
            array.add("CSS");
            //Print the array list
            System.out.println("List: " + array);
            //Now create type safe view  of the Collection by creating object of the Collection class
            Collection<String> arraylist = Collections.checkedCollection(array, String.class);
            //Printing the updated ArrayList after applying checkedCollection() method
            System.out.println("Typesafe view of the list: " + arraylist);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
