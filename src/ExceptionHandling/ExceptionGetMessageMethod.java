///The getMessage() method of Throwable class is used to return a detailed message of the Throwable object
/// which can also be null
/// One can use this method to get a detailed message of the exception
/// Syntax: public String getMessage()
/// This method returns a detailed message of this Throwable instance

package ExceptionHandling;

class ExceptionGetMessageMethod {
    public static void main(String[]args) throws Exception{
        try{
            //divide the numbers
            divide(2, 0);

        }
        catch (ArithmeticException e){
            System.out.println("Message String = " + e.getMessage());
        }
    }
    //method which divides two numbers
    public static void divide(int a, int b) throws ArithmeticException {
        int c = a /b;
        System.out.println("Result: " + c);

    }

}
