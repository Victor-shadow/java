package Collections;
import java.util.*;
public class TreeSetAddAllMethodArrayList {
    public static void main(String[]args){
        //Create an Empty Tree Set
        TreeSet<String> tree = new TreeSet<String>();
        //add() elements into the tree set
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("Laravel");
        tree.add("Python");
        tree.add("Scala");
        tree.add("PHP");
        //display the TreeSet
        System.out.println("TreeSet: " + tree);
        //an array collection is created
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Spring Boot");
        arrayList.add("Hibernate");
        arrayList.add("Selenium");
        //use addAll() method to add all the elements
        tree.addAll(arrayList);
        //display the final
        System.out.println("Final TreeSet: " + tree);


    }
}
