package Input;

import java.util.Scanner;

public class NextShortNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try {
            String s = "String";
            Scanner scanner = new Scanner(s);
            for (int i = 0; i < 5; i++){
                if (scanner.hasNextShort()){
                    System.out.println("Found Short Value: " + scanner.nextShort());
                }
                else {
                    System.out.println("Not Found Short value: "+ scanner.next());
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
