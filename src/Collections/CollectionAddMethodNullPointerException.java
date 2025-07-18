package Collections;
import java.util.*;
import java.io.*;

class CollectionAddMethodNullPointerException {
    public static void main(String[]args) {
        Collection<String> list = new ArrayList<String>();
        System.out.println("The Array List is: " + list);
        try{
            list.add(null);
        }
        catch (Exception e){
            System.out.println(" Exception " + e);
        }


    }
}
