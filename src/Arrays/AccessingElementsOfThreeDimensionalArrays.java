package Arrays;

class AccessingElementsOfThreeDimensionalArrays {
    public static void main(String[] args){
        int[][][]arr ={ { { 1, 2 }, { 3, 4 } },
            { { 5, 6 }, { 7, 8 } } };
        //printing array at index 0, 0, 0
        System.out.println("arr[0][0][0] = " + arr[0][0][0]);
    }
}
