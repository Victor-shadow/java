package RegularExpressions;
import java.lang.Character;
public class CharacterClassCodePointBeforeCodePointCountCompareTo {
    public static void main(String[]args){
        //use of codePointBefore
        char[]arg = new char[]{'r', 'e', 'g', 'u', 'l', 'a', 'r'};
        int position = 4;

        int val = Character.codePointBefore(arg, position);
        int val1 = Character.codePointBefore(arg, 1);
        int val2 = Character.codePointBefore(arg, 3, 1);
        System.out.println(" Unicode code point before " + position + " : " + val);
        System.out.println("Unicode code point before 1: " + val1);
        System.out.println("Unicode code point before 3:" + " to 1 : " + val2);
        System.out.println();
        //use of codePointCount
        int count = Character.codePointCount(arg, 1, 3);
        System.out.println("No of unicode points: " + count);
        System.out.println();

        //use of compareTo()
        Character c1 = Character.valueOf('r');
        Character c2 = Character.valueOf('e');

        int check = c1.compareTo(c2);
        System.out.println("c1 < c2: " + check);
        int check2 = c2.compareTo(c1);
        System.out.println("g2 > g1: " +  check2);
        int check3 = c2.compareTo(c2);
        System.out.println(" c2 = c2: " + check3);

    }
}
