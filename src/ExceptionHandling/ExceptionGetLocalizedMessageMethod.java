/// The getLocalizedMessage() method of Throwable class is used to get a locale-specific description
/// of the Throwable object when an Exception Occurred
/// It helps to modify the description of the Throwable Object according to the local specific message
/// For the subclasses which do not override this method, the default implementation of this method returns
/// the same result as getMessage()
///
/// syntax
/// public String getLocalizedMessage()
/// Return value: This method returns the locale-specific description of the Throwable Object when an Exception occurred
package ExceptionHandling;

public class ExceptionGetLocalizedMessageMethod {
    //Main method
    public static void main(String[]args) throws Exception{
        try {
            //add the numbers
            addPositiveNumbers(2,-1);
        }
        catch (Exception e){
            System.out.println("Localized message = " + e.getLocalizedMessage());
        }
    }
    //method which adds two positive numbers
    public static void addPositiveNumbers(int a, int b) throws Exception{
        if (a < 0 || b < 0){
            throw new Exception("Numbers are not positive");
        }
        else {
            System.out.println(a + b);
        }
    }


}