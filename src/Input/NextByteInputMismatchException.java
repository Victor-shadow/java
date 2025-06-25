package Input;

import java.util.Scanner;

public class NextByteInputMismatchException {
    public static void main(String[]argv) throws Exception{
        try{
            String s ="Name 9 + 6 = 15";

            Scanner scanner = new Scanner(s);

            while (scanner.hasNext()){
                System.out.println("Next Byte value: " + scanner.nextByte());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception at e: " + e);
        }
    }
}
