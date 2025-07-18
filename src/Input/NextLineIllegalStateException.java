package Input;

import java.util.Scanner;

public class NextLineIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "A String is an array of characters";

            Scanner scanner = new Scanner(s);
            scanner.close();
            System.out.println(scanner.nextLine());
            scanner.close();
        }
       catch (Exception e){
            System.out.println("Exception thrown: " + e);
       }
    }
}
