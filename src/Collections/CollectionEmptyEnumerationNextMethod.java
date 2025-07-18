package Collections;

import java.util.*;

public class CollectionEmptyEnumerationNextMethod {
    public static void main(String[]args){
        //create an array list
        List<String> data = new ArrayList<String >();
        //add elements to the list
        data.add("Python");
        data.add("java");
        data.add("PHP/Laravel");
        data.add("HTML/CSS");
        //Create Enumeration Object
        Enumeration<String> enm = Collections.emptyEnumeration();
        //get the elements
        while (enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
        System.out.println("empty");



    }
}
