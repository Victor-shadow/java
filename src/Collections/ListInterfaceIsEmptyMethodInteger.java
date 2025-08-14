package Collections;

import java.util.ArrayList;
import java.util.List;
public class ListInterfaceIsEmptyMethodInteger {
    public static void main(String[]args){
        //New Empty List
        List<Integer> list = new ArrayList<>();
        //Implement is Empty Method
        if(list.isEmpty()) {
            System.out.println("List is empty");
        } else{
            System.out.println("The list is not Empty");
        }
    }
}
