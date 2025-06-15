package Arrays;

class JaggedArray2D {
    public static void main(String[] args) {
        //it takes an array with 2 rows, the first row has three elements and the second row has two elements. It fills the array with numbers starting from 0 and then prints them
        //Declare a 2D array with 2 rows
        int[][] arr = new int[2][];
        //Creating a jagged Array
        arr[0] = new int[3];
        arr[1] = new int[2];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Printing the Array Elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
