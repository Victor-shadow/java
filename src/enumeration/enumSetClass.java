package enumeration;
import java.io.*;
import java.util.*;
public class enumSetClass {
    //define an enum for fruits
    public enum Fruits{
        APPLE, BANANA, TANGERINE, PINEAPPLE, PAWPAW, ORANGE, GRAPES;
    }
    public static void main(String[]args){
        //define a specific range from BANANA TO GRAPES
        EnumSet<Fruits> nameFruits = EnumSet.range(Fruits.APPLE,Fruits.BANANA);
        //ITERATE OVER THE SPECIFIC RANGE OF FRUITS
        for (Fruits fruits:nameFruits){
            System.out.println(fruits);
        }

    }


}
