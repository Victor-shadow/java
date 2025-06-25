package Input;
import java.util.*;

class NextBooleanIllegalStateException {
    public static void main(String[]argv) throws Exception{
        try {
            String s ="Gfg 9 + 6 = 12.0";
            Scanner scanner = new Scanner(s);

            //close the scanner
            scanner.close();
            System.out.println("Scanner closed");

            System.out.println("Trying to obtain: " + " next Boolean value");
            while (scanner.hasNext()){
                //if the next is a boolean print found and the Boolean
                if(scanner.hasNextBoolean()){
                    System.out.println("Found the Boolean value: " + scanner.nextBoolean());
                }
                //If no boolean is found  print NotFound and the token
                else {
                    System.out.println("Not Found Boolean"+ scanner.next());
                }
            }
        } catch (Exception e) {
            System.out.println("Exception thrown at: " + e);
        }


    }

}
