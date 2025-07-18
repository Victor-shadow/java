package Input;

import java.util.Scanner;

public class RadixMethodDefault {
    public static void main(String[]argv) throws Exception{
        String s = "a string is an array of characters";

        Scanner scanner = new Scanner(s);

        System.out.println("Scanner String: " + scanner.nextLine());

        System.out.println("Default Radix value: " + scanner.radix());
        //Change radix value of the scanner
        scanner.useRadix(20);

        System.out.println("Radix value changed to 20");
        //Print default Radix
        System.out.println("Default Radix value: " + scanner.radix());
        scanner.close();
    }
}
