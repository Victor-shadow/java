package Input;
import java.util.Scanner;

public class hasNextMethod {
    public static void main(String[]args){
        //Declare an object and initialize with pre-defined standard input object
        Scanner sc = new Scanner(System.in);

        //Initialize sum and count of input elements
        int sum = 0;
        int count =0;
        System.out.println("Enter integers to calculate mean(type 'done' to finish):");

        //Loop to read input until "done" is entered
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                //read an integer value
                int num = sc.nextInt();
                sum += num;
                count++;
            } else {
                String input = sc.next();
                if(input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid Input: Please enter an integer or type 'done' to finish ;");
                }
            }
        }
        //calculate and display mean
        if(count > 0){
            //Use double for precise mean calculation
            double mean = (double) sum /count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No integers were input. Mean cannot be calculated");
        }

    }


}
