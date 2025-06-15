package Arrays;

public class DeclareRowsAndColumnsIn2DArrays {
    public static void main(String[] args){
        //Rows and Columns in an array
        int m = 3; //number of rows
        int n = 3; //number of columns

        //Array Declared and Initialized
        int[][] arr = new int[m][n]; //creating a 2D array with 3 rows and 3 columns
        int it = 1; //Start with number 1

        //Assigning Values to an Array
        for(int i = 0; i < m; i++){ //loop through number of rows
            for(int j = 0; j < n; j++){ //loop through number of columns
                arr[i][j] = it; //Assign value to each position
                it++; // Increase the number for the next position

            }
        }
        //Print Array
        for(int i = 0; i < m;  i++){
            for(int j = 0; j < n; j++){
                System.out.println( arr[i][j] + " ");
                System.out.println();
            }
        }



    }
}
