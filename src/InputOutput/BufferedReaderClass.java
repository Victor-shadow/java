package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[]args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = r.readLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(r.readLine());
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
