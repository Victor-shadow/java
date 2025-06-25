package Input;
import java.util.*;

public class NextBooleanMethod {
    public static void main(String[]argv) throws Exception{
        String s ="Name 9 + 6 = 12.0 false";
        //Create new scanner wit specified String object
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()){
            //If the next is a boolean print found and the boolean
            if(scanner.hasNextBoolean()){
                System.out.println("Found boolean value: " + scanner.nextBoolean());
                //If boolean not found print "Not found" and return token
            } else {
                System.out.println("Not found boolean() value " + scanner.next());

            }

        }
scanner.close();


    }

}
