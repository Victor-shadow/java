package Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayWithUserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking number of rows and columns from user
        System.out.print("Enter number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the elements for the array: ");
        //Taking Input from the user for each element of the array
        //Using nested for loop
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of the array are: ");
        //Printing elements of the array
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
