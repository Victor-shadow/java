package Arrays;

class OneDimensionalArrayClone {
    public static void main(String[] args){
        int initializeArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cloneArray[] = initializeArray.clone();

        //print false since a shallow copy is created
        System.out.println(initializeArray==cloneArray);

        for(int i = 0; i < cloneArray.length; i++){
            System.out.print(cloneArray[i] + " ");
        }
    }

}
