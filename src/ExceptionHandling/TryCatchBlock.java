package ExceptionHandling;

class TryCatchBlock {
    static void fun(){
        try{
            throw new NullPointerException("try-catch block");
        }
        catch (NullPointerException e){
            System.out.println("Caught inside fun()");
            throw e; //rethrowing exception
        }
    }
    public static void main(String[]args){
        try {
            fun();
        }
        catch (NullPointerException e){
            System.out.println("caught in main");
        }
    }
}
//the use of throw keyword to explicitly throw a NullPointerException
//The exception is caught inside the fun() method and rethrown, where it is caught in the main() method
