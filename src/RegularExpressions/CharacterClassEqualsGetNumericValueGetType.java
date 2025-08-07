package RegularExpressions;
import java.lang.Character;
public class CharacterClassEqualsGetNumericValueGetType {
    public static void main(String[]args){
        //equals() method
        Character c1 = Character.valueOf('J');
        Character c2 = Character.valueOf('A');

        boolean check = c1.equals(c2);
        boolean check2 = c1.equals(c1);

        System.out.println("Are j and a equal?: " + check);
        System.out.println("Are j and j equal?: " + check2);
        //Use getNumericValue() method
        int c = Character.getNumericValue(c1);
        int c3 = Character.getNumericValue(c2);

        System.out.println("Int value for J: " + c);
        System.out.println("Int value for A: " + c3);
        System.out.println();
                //Use of getType method
          Character c4 = Character.valueOf('$');
          Character c5 = Character.valueOf('6');

          int r1 = Character.getType(c1);
          int r2 = Character.getType(c2);
          int r3 = Character.getType(c4);
          int r4 = Character.getType(c5);

          System.out.println("Type for lowercase: " + r1);
          System.out.println("Type for uppercase: " + r2);
          System.out.println("Type for currency: " + r3);
          System.out.println("Type for numeric: " + r4);

    }
}
