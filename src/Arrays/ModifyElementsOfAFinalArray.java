package Arrays;

public class ModifyElementsOfAFinalArray {
    public static void  main(String[]args){
        final int[]array = {1, 2, 3, 4, 5};
        array[4] = 6;
        for(int i = 0; i < array.length; i++){
            System.out.println(" " + array[i]);
        }

    }
}
