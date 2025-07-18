package Input;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[]argv) throws Exception{
        String s = "String \n An Array \n of characters";
        Scanner scanner = new Scanner(s);
        //print the next Line
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        //close the scanner
        scanner.close();

    }
}
