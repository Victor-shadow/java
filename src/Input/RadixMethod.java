package Input;

import java.util.Scanner;

//The radix() method of java.util.Scanner class returns this scanner default radix
//Syntax: public int radix()
public class RadixMethod {
    public static void main(String[]argv) throws Exception{
        String s = "String has Scanner methods";
        Scanner scanner = new Scanner(s);

        System.out.println("Scanner String:\n" + scanner.nextLine());

        System.out.println("Default radix value: "+ scanner.radix());

        scanner.close();
    }


}
