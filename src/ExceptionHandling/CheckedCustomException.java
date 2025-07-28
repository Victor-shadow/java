package ExceptionHandling;

class invalidAgeException extends Exception{
    public invalidAgeException(String m){
        super(m);
    }
}
//Using the custom Exception
public class CheckedCustomException {
    public static void validate(int age) throws invalidAgeException{
        if (age < 18){
            throw new invalidAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[]args){
        try {
            validate(1);
        } catch (invalidAgeException e){
            System.out.println("Caught exception: " + e.getLocalizedMessage());
        }
    }
}
