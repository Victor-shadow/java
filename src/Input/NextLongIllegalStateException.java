package Input;

import java.util.Scanner;

public class NextLongIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try {
            String s = "string 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);
            scanner.close();
            System.out.println("Scanner closed.");

            System.out.println("Trying to get " + "next Long value");

            while (scanner.hasNextLong()){
                if (scanner.hasNextLong()){
                    System.out.println("Found Long value: " + scanner.nextLong());
                }
                else {
                    System.out.println("Not found Long value: " + scanner.next());
                }
            }
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
