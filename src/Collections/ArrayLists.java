package Collections;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[]args){
        //Create an array list to store elements
        ArrayList<String> array = new ArrayList<>();

        //Add elements to the list
        array.add("Kotlin");
        array.add("Java");
        array.add("Python");
        array.add("Python"); //duplicates are allowed

        System.out.print("" + array);
    }


}
