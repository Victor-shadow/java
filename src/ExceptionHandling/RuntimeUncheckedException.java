package ExceptionHandling;

class RuntimeUncheckedException {
    public static void main(String[]args){
        //Here we are dividing by zero
        //which will not be caught at compile time
        //as there is no mistake that has been caught at runtime
        //because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}
