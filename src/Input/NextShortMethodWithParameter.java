package Input;

import java.util.Scanner;

public class NextShortMethodWithParameter {
    public static void main(String[]argv) throws Exception{
        String s = "string 9 + 6 = 15.0";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if (scanner.hasNextShort()){
                System.out.println("Found Short Value :" + scanner.nextShort(15));
            }
            else {
                System.out.println("Not found short value: " + scanner.next());
            }
        }
        scanner.close();
    }
}
