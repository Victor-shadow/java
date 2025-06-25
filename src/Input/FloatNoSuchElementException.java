package Input;

import java.util.Scanner;

public class FloatNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            String name = "String";
            Scanner scanner = new Scanner(name);

            for(int i = 0; i < 5; i++){
                if (scanner.hasNextFloat()){
                    System.out.println("Found Float Value at: " + scanner.nextFloat());
                }
                else{
                    System.out.println("Not Found float Value: " + scanner.next());
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.print("Exception thrown: " + e);
        }
    }
}
