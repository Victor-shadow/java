package Input;
import  java.util.*;

//The reset() method of java.util.Scanner class resets this scanner.
//On resetting a scanner, it discards all its explicit state information which may have been changed by
//invocations of useDelimiter(java.util.Regex.Pattern), useLocale(java.util.Locale) or use Radix(int) syntax
public class ResetMethod {
    public static void main(String[]argv) throws Exception{
        String s = "This class has scanner methods";
        Scanner scanner = new Scanner(s);

        System.out.println("Scanner String:\n" + scanner.nextLine());

        //Change Locale of the scanner
        scanner.useLocale(Locale.US);

        //Change the radix of the scanner
        scanner.useRadix(30);

        System.out.println("\nBefore Reset:\n");

        //Print values before reset
        System.out.println("Radix: " + scanner.radix());
        System.out.println("Locale: " + scanner.locale());

        //reset
        scanner.reset();

        System.out.println("\nAfter Reset:\n");
        //print values after reset
        System.out.println("Radix: " + scanner.radix());
        System.out.println("Locale: " + scanner.locale());

        //close the scanner
        scanner.close();
    }

}
