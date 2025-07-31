package InputOutput;
import java.util.*;
public class FileConsole {
    public static void main(String[]args){
        //Using Scanner for Getting User input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = scanner.nextLine();
        System.console();
    }
}
