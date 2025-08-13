/// The values can be removed from a set using remove() method

package Collections;
import java.util.*;
public class SetInterfaceRemoveElements {
    public static void main(String[]args){
        //Declare object of Set type String
        Set<String> set = new HashSet<String>();
        //Elements are added using add() method
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("E");

        System.out.println("Initial HashSet: " + set);
        //Remove custom element using remove() method
        set.remove("B");
        System.out.println("After removing elements: " + set);

    }
}
