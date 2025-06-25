package Input;
import java.util.*;


public class NextByteMethodWithParameter {
    public static void main(String[]argv) throws Exception{
        String s = "Name 9 + 6= 15.0";
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            if(scanner.hasNextByte()){
                System.out.println("Found Byte value: " + scanner.nextByte(12));
            }
            else{
                System.out.println("Not found byte value: " + scanner.next());
            }
        }
    }

}
