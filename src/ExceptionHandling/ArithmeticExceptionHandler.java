package ExceptionHandling;

class ArithmeticExceptionHandler {
    public static void main(String[]args){
        int n = 10;
        int m = 0;
        try {
            //code that may throw Exception
            int ans = n / m;
            System.out.println("Answer: " + ans);
        }
        catch (ArithmeticException e){
            //Handle the exception
            System.out.println("Error: Division by zero is not allowed: ");
        }
        finally {
            System.out.println("Program continues after handling the exception");
        }

    }

}
