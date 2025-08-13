package Collections;
import java.util.*;
public class SetInterfaceAddAllMethod {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String> set1 = new TreeSet<String>();
        //use add method to add all elements to the set
        set1.add("100");
        set1.add("200");
        set1.add("300");

        System.out.println("Initial set: " + set1);
        //An ArrayList Collection is created
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("400");
        arrayList.add("500");
        arrayList.add("600");
        //addAll() method
        set1.addAll(arrayList);
        System.out.println("Final set: " + set1);


    }
}
