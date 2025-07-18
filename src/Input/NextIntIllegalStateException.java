package Input;

import java.util.Scanner;

public class NextIntIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "String 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);
            scanner.close();
            System.out.println("Scanner closed!");
            System.out.println("Trying to get " + "next Int value");

            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
                    System.out.println("Found Int Value: " + scanner.nextInt());
                }
                else {
                    System.out.println("Not Found Int Value: " + scanner.next());
                }
            }
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
