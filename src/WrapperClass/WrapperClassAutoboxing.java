package WrapperClass;

import java.util.ArrayList;

public class WrapperClassAutoboxing {
    public static void main(String[]args){
        char ch = 'b';
        //Autoboxing - primitive to Character object
        Character a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //Autoboxing because array list stores only objects
        arrayList.add(2000);
        //printing values
        System.out.println(arrayList.get(0));
    }
}
