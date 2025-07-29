package InputOutput;
import java.io.*;
import java.util.*;
public class FileBufferedReader {
    public static void main(String[] args) throws IOException {
        //create BufferedReader to read input effectively
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //read the first lines and split into tokens
        StringTokenizer st = new StringTokenizer(br.readLine());
        //read the total number of integers (n) and divisors(k)
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //initialize counters for divisible numbers
        int count = 0;
        //process each integer
        while (n-- > 0) {
            //read the next integer
            int x = Integer.parseInt(br.readLine());
            //check if the number is divisible by k
            if (x % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
