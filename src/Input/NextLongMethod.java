package Input;

import java.util.Scanner;

public class NextLongMethod {
    public static void main(String[]argv) throws Exception{
        String s = "String 9.0 + 6 = 15L";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if (scanner.hasNextLong()){
                System.out.println("Found Long value: " + scanner.nextLong());
            }
            else{
                System.out.println("Not found Long value: " + scanner.next());
            }
        }
        scanner.close();
    }
}
