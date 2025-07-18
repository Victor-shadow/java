package Input;

import java.util.Scanner;

public class NextIntInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "string 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);
            while (scanner.hasNext()){
                System.out.println("Next Int Method: " + scanner.nextInt());
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println
                    ("Exception caught at :" + e);
        }
    }
}
