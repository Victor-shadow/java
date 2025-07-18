package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Collections.sort() is used to sort the elements present in the specified list of Collections in an ascending order
//while Collections.reverseOrder() sorts the elements in reverse order
public class SortingCollection {
    public static void main(String[]args){
        List<String> array = new ArrayList<>();
        //Add Elements to the List using add method
        array.add("Kotlin");
        array.add("java");
        //Add one or more elements using addAll() methods
        Collections.addAll(array, "Python", "C++", "Javascript");
        //Sort according to default ordering
        Collections.sort(array);
        //Print elements
        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i) + " ");
        }
        System.out.println();
        //Sort according to reverse ordering
        Collections.sort(array, Collections.reverseOrder());
        //Print reverse Order
        for (int i = 0; i <array.size(); i++){
            System.out.println(array.get(i) + " ");
        }
    }


}
