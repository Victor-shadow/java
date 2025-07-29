package InputOutput;
import java.util.*;
public class FileScannerClass {
    public static void main(String[]args){
        //Create scanner object
        Scanner s = new Scanner(System.in);
        //Read number of inputs
        int n = s.nextInt();
        //Read divisor
        int k = s.nextInt();
        //Initialize count
        int c = 0;
         while (n --> 0){
             //read the number
             int x = s.nextInt();
             //check divisibility
             if (x % k == 0){
                 c++;
             }
         }
        System.out.println(c);
    }
}
