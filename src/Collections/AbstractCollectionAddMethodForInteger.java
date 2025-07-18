package Collections;
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionAddMethodForInteger {
    public static void main(String[]args){
        AbstractCollection<Object> abs = new LinkedList<Object>();
        abs.add(1);
        abs.add(2);
        abs.add(3);
        abs.add(4);
        abs.add(5);
        //Display the collection
        System.out.println("AbstractCollection: " + abs
        );

    }
}
