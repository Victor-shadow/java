package Input;

import java.util.Scanner;

public class NextLongNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try {
            String s = "String";
            Scanner scanner = new Scanner(s);

            for (int i = 0; i <5; i++){
                if (scanner.hasNextLong()){
                    System.out.println("Found long value: " + scanner.nextLong());
                }
                else {
                    System.out.println("Not Found long value: " + scanner.next());
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
