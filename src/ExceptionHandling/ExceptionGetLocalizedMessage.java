package ExceptionHandling;

class ExceptionGetLocalizedMessage {
    //Main Method
    public static void main(String[]args) throws Exception{
        try{
            testException();
        }
        catch (Throwable e){
            System.out.println("LocalizedMessage of Exception: " + e.getLocalizedMessage());
        }
    }
    //Main method which throws IndexOutOfBoundsException
    public static void testException() throws IndexOutOfBoundsException{
        throw  new IndexOutOfBoundsException("Forcefully generated Exception");

    }


}
