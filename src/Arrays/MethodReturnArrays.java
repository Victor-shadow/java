package Arrays;

//A method can also return an array
class MethodReturnArrays {
    public static void main(String args[])
    {
        int arr[] = method1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] method1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}
