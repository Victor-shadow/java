package InputOutput;
import java.io.*;
import java.util.*;
public class FileFastReader {
    //FastReader class
    static class FastReader{
        //BufferedReader to read input
        BufferedReader b;
        //StringTokenizer to tokenize Input
        StringTokenizer s;
        //constructor to initialize BufferedReader
        public FastReader(){
            b = new BufferedReader(new InputStreamReader(System.in));
        }
        //Method to read next token as String
        String next(){
            while (s == null || !s.hasMoreElements()){
                try {
                    s = new StringTokenizer(b.readLine());

                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }
        //method to read the next token as Integer
        int nextInt(){
            return Integer.parseInt(next());
        }
        //method to read next token as a Long
        long nextLong(){
            return Long.parseLong(next());
        }
        //method to read next token as a Double
        double nextDouble(){
            return Double.parseDouble(next());
        }
        //Method to read the next line as a String
        String nextLine(){
            String str = "";
            try {
                if (s.hasMoreTokens()){
                    str = s.nextToken("\n");
                } else{
                    str = b.readLine();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[]args){
        //create a FastReader Instance for input
        FastReader s = new FastReader();
        //Read the number of integers
        //(n) and divisor (k)
        int n = s.nextInt();
        int k = s.nextInt();
        //initialize the counter for divisible numbers
        int c = 0;
        //loop through the integers
        while (n -- > 0){
            //read the next Integer
            int x = s.nextInt();
            //check if divisible by k
            if (x % k == 0){
                c++;
            }
        }
        System.out.println(c);
    }

}
