package Arrays;
//JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of an array.

public class ArraysIndexOutOfBoundsException {
    public static void main(String[] args){
        int[] newArray = new int[5];
        newArray[0] = 10;
        newArray[1] = 100;
        newArray[2] = 1000;
        newArray[3] = 10000;

        System.out.println("Trying to access an Element in an array out of array size");
        System.out.println(newArray[5]);
    }
}
