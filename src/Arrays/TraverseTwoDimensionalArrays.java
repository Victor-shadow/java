package Arrays;

public class TraverseTwoDimensionalArrays {
    public static void main(String[] args){
        int arr[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {2, 4, 6, 8, 10}, {3, 6, 9}};

        // Traversing the 2D array correctly
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " "); // Print without extra newline
            }
            System.out.println(); // Print new line after each row
        }
    }
}