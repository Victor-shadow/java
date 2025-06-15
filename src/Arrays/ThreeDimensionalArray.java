package Arrays;

public class ThreeDimensionalArray {
    //create and print a 3D array
    public static void main(String[] args){
        //Array Creation and Initialization
        int[][][] arr = {{{1, 2}, {3, 4}, {5, 6}, {7, 8}}};
        //Define x, y and z in Multi-Dimensional Array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        //Printing the array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < o; k++){
                    System.out.println("arr[" + i + "][" +j + "][" +k + "] = " + arr[i][j][k]);
                }
            }
        }




    }
}
