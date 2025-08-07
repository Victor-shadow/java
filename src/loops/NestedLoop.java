package loops;
import java.lang.*;
import java.io.*;
//driver class

class NestedLoop {
    //A function to print all prime factors
    //of a given number n
    public static void primeFactors(int n){
        //print the numbers of 2 that divide n
        while(n % 2 == 0){
            System.out.println(2 + " ");
            n /= 2;
        }
        //n must be odd at this point
        //so we can skip one element(Note:i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            //while i divides n , print i and divide n
            while (n % i == 0){
                System.out.println(i + " ");
                n /= i;
            }
        }
        //this condition is to handle the case where
        //n is a prime number greater than 2
        if(n > 2){
            System.out.println(n);
        }
    }
    public static void main(String[]args){
        int n = 315;
        primeFactors(n);
    }
}
