package Input;
import java.util.*;

public class NextIntMethod {
    public static void main(String[]argv) throws Exception{
        String s = "string 9 + 6 = 15.0";
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println("Found int value: " + scanner.nextInt());
            }
            else {
                System.out.println("Not found Int value: " + scanner.next());
            }
        }
        scanner.close();


    }
}
