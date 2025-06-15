package Arrays;
import java.util.Scanner;

public class InsertMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking number of rows from user
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();

        // Initialize a 2D array with dynamic column sizes
        int[][] arr = new int[n][];

        int odd = 0, even = 0;

        // Taking Input for each row dynamically
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int m = s.nextInt();

            arr[i] = new int[m]; // Defining column size for this row

            System.out.println("Enter " + m + " elements for row " + i + ":");
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();

                // Counting even and odd numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        // Displaying array structure
        System.out.println("\nArray Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Newline after each row
        }

        // Printing aggregated results for even and odd numbers
        System.out.println("\nTotal Even Numbers: " + even);
        System.out.println("Total Odd Numbers: " + odd);

        s.close();
    }
}