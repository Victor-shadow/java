package Collections;
import java.util.*;
class VectorClass {
    //main method
    public static void main(String[]args){
        //Declare the Vector
        Vector<Integer> v = new Vector<Integer>();
        //append new elements at the vector
        for (int i = 1; i <= 5; i++)
            v.add(i);
        //print the elements
        System.out.println(v);
        //remove elements
        v.remove(3);
        //display the vector after deletion
        System.out.println(v);
        //print elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i) + " ");

    }
}
