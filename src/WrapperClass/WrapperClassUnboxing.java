package WrapperClass;

import java.util.ArrayList;

class WrapperClassUnboxing {
    public static void main(String[]args){
        Character ch = 'c';
        //unboxing - Character object to primitive data types
        char a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        //unboxing because get method returns an Integer object
        int num = arrayList.get(0);
        //print values from primitive data types
        System.out.println(num);

    }

}
