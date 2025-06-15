package Arrays;

public class ReassignmentErrorInAFinalArray {
    public static void main(String[]args){
        //Declaration of a final array
        final int[]arr1 = {10, 20, 30, 40, 50, 60};
        //Declaring normal integer array
        int arr2[] = {1, 2, 3, 4, 5, 6};
        //Assigning values to each other
        arr2 = arr1;
        //Results in an error
        // arr1 = arr2;
        //Iteration over normal integer array
        for(int i = 0; i < arr2.length; i++){
            //Printing elements in an array
            System.out.println(arr2[i]);
        }
    }
}
