package Arrays;

class TwoDimensionalArrays {
    public static void main(String[] args){
        //Array Initialization and Assignment
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        //Printing array
        for(int i = 0; i<arr.length; i++){ //represents number of rows
            for(int j = 0; j <3; j++){ //represents number of columns
                System.out.print(arr[i][j] + " ");
             System.out.println();
            }

        }
    }

}
