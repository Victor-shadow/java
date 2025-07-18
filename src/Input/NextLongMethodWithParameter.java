package Input;

import java.util.Scanner;

public class NextLongMethodWithParameter {
    public static void main(String[]argv) throws Exception{
        String s = "String 9 + 6 = 15.0";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if (scanner.hasNextLong()){
                System.out.println("Found long value: " + scanner.nextLong(15));
            }
            else{
                System.out.println("Not Found Long Value: " + scanner.next());
            }
        }
        scanner.close();
    }
}
