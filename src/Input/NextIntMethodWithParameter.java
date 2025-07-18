package Input;
import java.util.*;

public class NextIntMethodWithParameter {
    public static void main(String[]argv) throws Exception{
        String s = "string 9 + 6 = 15.0";
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println("Found Int Value: " + scanner.nextInt(15));

            }
            else{
                System.out.println("Not Found Int Value: " + scanner.next());
            }
        }
        scanner.close();
    }

}
