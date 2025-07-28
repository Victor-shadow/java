package ExceptionHandling;

class arrayIndexOutBoundsException {
    public static void main(String[]args){
        //Taking an Array of size 4
        int [] arr = new int[4];
        //This statement will cause an exception
        int i = arr[4];
        System.out.println("This statement is executed");
    }

}
