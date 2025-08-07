package RegularExpressions;
import java.util.regex.*;
public class CharacterClassCharCountCharValueCodePointAt {
    public static void check(int element){
        //check for regex
        if (element == 2)
            System.out.println("Valid Regex character");
        else
            System.out.println("Invalid regex character");
    }
    public static void main(String[]args){
        //use of charCount() method
        int regular = 0x9999;
        int regular1 = 0x10000;
        int regular2 = 0x10001;


        int c = Character.charCount(regular);
        int c1 =  Character.charCount(regular1);
        int c2 =  Character.charCount(regular2);

        check(c);
        check(c1);
        check(c2);

        System.out.println();

        //Character object
        Character m;

        //Assign value r to m
        m = Character.valueOf('r');

        char regex;

        //Use of charValue() method
        regex = m.charValue();

        System.out.println("Primitive value of regex: " + regex);
        System.out.println();

        //use of codePointAt()
        char[]arg = new char[]{'r', 'e', 'g', 'u', 'l', 'a', 'r', 'e', 'x', 'p', 'r', 'e', 's', 's', 'i', 'o', 'n'};
        int val, val1, position = 3;

        val = Character.codePointAt(arg,position);
        val1 = Character.codePointAt(arg,0);

        System.out.println("Unicode code point at: " + position + " : " + val);
        System.out.println("Unicode code point  at 0: " + val1);
    }
}
