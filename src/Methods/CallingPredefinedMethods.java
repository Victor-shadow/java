package Methods;
//hashCode() method is inherited from the Object class
//The method returns a unique integer hash code for the CallingPredefinedMethods object.
public class CallingPredefinedMethods {
    public static void main(String[]args){
        //Creating object of the class in the Main one
        CallingPredefinedMethods object = new CallingPredefinedMethods();
        //Calling predefined Object
        System.out.println(object.hashCode());
    }
}
