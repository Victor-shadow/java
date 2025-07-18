package Input;

import java.util.Scanner;

public class NextLineNoSuchElement {
    public static void main(String[]argv) throws Exception{
        try{
            String s ="";
            Scanner scanner = new Scanner(s);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (Exception e) {
            System.out.print("Exception thrown: " + e);
        }
    }
}
