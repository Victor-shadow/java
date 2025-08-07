package loops;
import java.io.*;
//print elements of a 2D array

class NestedLoop2DArray {
    public static void print2D(int [][] mat){
        //loop through all rows
        for (int i = 0; i < mat.length;i++) {
            //loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
        }
    }
    public static void main(String []args) throws IOException{
        int [][] mat = { { 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        print2D(mat);
    }
}
