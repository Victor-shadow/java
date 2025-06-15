package Arrays;
//passing of arrays to methods
public class PassingArraysIntoMethods {
    //Main Method
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Passing sum method to array I
        sum(arr);
    }
    public static void sum(int[] arr){
        //Getting sum of array values
        //counter variable
        int sum = 0;
        for(int i = 0;  i< arr.length; i++){
            sum += arr[i];
            System.out.println("Sum of Array Values: " + sum);
        }


    }
}
