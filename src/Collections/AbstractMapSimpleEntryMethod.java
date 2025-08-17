package Collections;
import java.util.*;
public class AbstractMapSimpleEntryMethod {
    public static void main(String[]args){
        //Create a SimpleEntry with a null
        AbstractMap.SimpleEntry<String,String > simpleEntry = new AbstractMap.SimpleEntry<>(null, "value");
        //print the entry
        System.out.println(simpleEntry);
    }
}
