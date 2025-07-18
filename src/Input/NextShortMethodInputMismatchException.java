package Input;

import java.util.Scanner;

public class NextShortMethodInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try {
            String s = "string 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);
            while (scanner.hasNext()){
                System.out.println("Found short value: "+ scanner.nextShort());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }


    }
}
