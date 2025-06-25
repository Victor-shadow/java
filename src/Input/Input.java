package Input;
//Scanner class to ask input from user
import java.util.Scanner;

class Input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        //nextLine is used to read the line value which is entered by the user and printed to the console

        System.out.println("Hello " + name + " Welcome to Java Programming ");
    }


}
