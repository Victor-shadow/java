package Input;

import java.util.Scanner;

public class NextShortMethod {
    public static void main(String[]argv) throws Exception{
        String s = "string 9 + 6 = 15.0";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if (scanner.hasNextShort()){
                System.out.println("Found Short Value: " + scanner.nextShort());
            }
            else{
                System.out.println("Not Found Short Value: " + scanner.next());
            }
        }
        scanner.close();
    }
}
