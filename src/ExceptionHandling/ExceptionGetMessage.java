package ExceptionHandling;

class ExceptionGetMessage {
    //Main Method
    public static void main(String[]args) throws Exception{
        try {
            test();
        }
        catch (Throwable e){
            System.out.println("Message of Exception: " + e.getMessage());
        }
    }
    //method which throws UnsupportedOperationException
    public static void test() throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
}
