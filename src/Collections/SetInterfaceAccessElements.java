/// If one wishes to access elements in a set use inbuilt methods like contains()
package Collections;
import java.util.*;
public class SetInterfaceAccessElements {
    public static void main(String[]args){
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        System.out.println("Set is: " + set);

        String s = "D";
        System.out.println("Contains " + s + " " + set.contains(s));


    }
}
