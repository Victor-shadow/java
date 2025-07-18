package Input;

import java.util.Scanner;

public class NextLongInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try {
            String s = "String 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);
            while (scanner.hasNext()){
                System.out.print("Next Long Value: " + scanner.nextLong());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
