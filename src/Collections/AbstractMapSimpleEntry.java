/// In Java, the toString() method of the AbstractMap.SimpleEntry class is used to return a String representation
/// of the key-value pair in the format key =value
/// If the key or value is null. It is represented as the string null
/// This method is used to provide a straightforward way to display contents of the Simple Entry Object
/// Syntax of toString(): public String toString()
/// Return Type: This method returns the String that represents the key-value pair in the SimpleEntry object
package Collections;
import java.util.*;
public class AbstractMapSimpleEntry {
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[]args){
        //create an ArrayList
        ArrayList<AbstractMap.SimpleEntry<Integer,Integer> > arrayList = new ArrayList<AbstractMap.SimpleEntry<Integer,Integer>>();
        //add values
        arrayList.add(new AbstractMap.SimpleEntry(0, 100));
        arrayList.add(new AbstractMap.SimpleEntry(1, 200));
        arrayList.add(new AbstractMap.SimpleEntry(2, 300));

        for (int i = 0; i < arrayList.size(); i++){
            //get the map from the list
            AbstractMap.SimpleEntry<Integer,Integer> simpleEntry = arrayList.get(i);
            //get the representation of the map
            String value = simpleEntry.toString();
            System.out.println(value);

        }


    }
}
