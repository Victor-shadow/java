package Collections;
import java.util.*;
public class ListInterfaceSizeMethodString {
    public static void main(String[]args){
        //Create an empty String list and declare elements of a String type
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        //get total size of the list
        int size = list.size();
        //print the size of the list
        System.out.println("Size: " + size);

    }
}
