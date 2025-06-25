package Input;

import java.util.Scanner;

public class FloatIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try{
            String s = "Name 9 + 6 = 15.0";
            Scanner scanner = new Scanner(s);

            scanner.close();
            System.out.print("Scanner closed");

            System.out.print("Trying to get "
                    + "next Float value");

            while (scanner.hasNext()){
                if (scanner.hasNextFloat()){
                    System.out.print("Found Float Value at: " + scanner.nextFloat());
                }
                else{
                    System.out.print("Not found float value: " + scanner.next());
                }

            }

        } catch (Exception e) {
            System.out.print("Exception thrown: " + e);
        }
    }
}
