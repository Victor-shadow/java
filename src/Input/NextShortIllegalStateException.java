package Input;

import java.util.Scanner;

public class NextShortIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "string 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);

            scanner.close();
            System.out.println("Scanner Closed");

            System.out.println("Trying to get: " + "next short value");

            while (scanner.hasNext()){
                if (scanner.hasNextShort()){
                    System.out.println("Found short value: " + scanner.nextShort());
                }
                else {
                    System.out.println("Not Found Short Value: " + scanner.next());
                }
            }
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
