package Collections;

import java.util.LinkedList;

public class LinkedListCollectionRemoveMethod {
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Rust");
        list.add("Scala");

        //use the Get method and the for loop
        for (int n = 0; n < list.size(); n++){
            System.out.println(list.get(n) + " ");
        }

        System.out.println();

        //use for-each loop
        for (String str: list)
            System.out.println(str + " ");








    }
}
