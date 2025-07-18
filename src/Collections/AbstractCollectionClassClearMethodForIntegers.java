package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionClassClearMethodForIntegers {
    public static void main(String[]args){
        AbstractCollection<Object> abs = new LinkedList<Object>();
        abs.add(100);
        abs.add(200);
        abs.add(300);
        abs.add(400);
        abs.add(500);
        //Display the Collection
        System.out.println("Abstract Collection: " + abs);
        //Clear the collection
        abs.clear();
        //Print the cleared collection
        System.out.println("Abstract Collection " + "After using clear: " +abs);


    }
}
