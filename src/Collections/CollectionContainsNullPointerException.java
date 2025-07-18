package Collections;
import java.util.*;
public class CollectionContainsNullPointerException {
    public static void main(String[]args){
        //Create an Empty Array List
        Collection<String> list = new ArrayList<String >();
        try{
            //check presence of null
            list.contains(null);
        }
        catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}
