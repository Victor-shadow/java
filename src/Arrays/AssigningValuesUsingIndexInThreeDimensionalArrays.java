package Arrays;

public class AssigningValuesUsingIndexInThreeDimensionalArrays {
    public static void main(String[] args){
        int[][][] arr = new int[2][2][2];
        //Three Dimensional Array(x, y, z dimension)
        int n = arr.length;
        int m = arr[0].length;
        int o= arr[0][0].length;
        int it = 1;

        //Assigning Values to the array
        for(int i =0; i <n; i++){
            for(int j=0; j< m; j++){
                for(int k=0; k< o; k++){
                    arr[i][j][k] = it;
                            it++;
                }
            }
        }
        //Printing the Array
        for(int i = 0; i <n; i++){
            for(int j= 0; j<m; j++){
                for(int k = 0; k <o; k++){
                    System.out.print(arr[i][j][k] + " ");
                    System.out.println();
                }
                System.out.println();
            }
        }



    }
}
