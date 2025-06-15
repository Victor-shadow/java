package Arrays;

public class MultiDimensionalArrayClone {
    public static void main(String[] args){
        int[][] initializeArray = {{2, 4, 6, 8, 10, 12, 14, 16, 18}, {1, 3, 5, 7, 9, 11, 13, 15, 17}};
        int[][] cloneArray = initializeArray.clone();

        //prints false
        System.out.println(initializeArray==cloneArray);
        //print true since a shallow copy is created(sub-arrays are shared)
        System.out.println(initializeArray[0] == cloneArray[0]);
        System.out.println(initializeArray[1] == cloneArray[1]);
    }
}
