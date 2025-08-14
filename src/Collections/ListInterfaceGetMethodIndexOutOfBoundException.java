package Collections;
import java.util.*;
public class ListInterfaceGetMethodIndexOutOfBoundException {
    public static void main(String[]args){
        //Create an Empty Integer List
        List<Integer> list = new ArrayList<Integer>();
        //add() method to initialize values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        try {
            //Try to access an element that will throw an IndexOutOfBoundsException
            int element = list.get(5);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
