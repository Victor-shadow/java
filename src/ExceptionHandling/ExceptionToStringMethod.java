/// The toString() method of java.lang.Throwable class is used to return a String representation of this Throwable which
/// consists of the name of the class of this object, a colon and a space(":") and a string
/// which is the same as the result of invoking this object's getLocalizedMessage() method
/// and if getLocalizedMessage() returns null, then just the class name is returned
/// Syntax: public String toString()
/// This method returns the String representation of the Throwable if the exception occurs


package ExceptionHandling;

class ExceptionToStringMethod {
    //Main Method
    public static void main(String[]args) throws Exception{
        try {
            testException();
        }
        catch (Throwable e){
            //print using toString method
            System.out.println("Exception: " + e.toString());
        }
    }
    //Method which throws Exception
    public static void testException() throws Exception{
        throw  new Exception("New Exception Thrown");

    }
}
