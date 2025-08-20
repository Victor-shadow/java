package Collections;
import java.util.*;
public class AbstractCollectionToStringMethod {
    public static void main(String[]args){
        AbstractCollection<Integer> abstractCollection = new ArrayList<Integer>();
        abstractCollection.add(1);
        abstractCollection.add(2);
        abstractCollection.add(3);
        abstractCollection.add(4);

        System.out.println(abstractCollection.toString());
    }
}
