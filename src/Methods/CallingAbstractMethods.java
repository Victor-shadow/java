package Methods;
//Abstract methods are declared in abstract classes
//The methods must be implemented in the subclasses
abstract class MethodImplementation {
    abstract void check(String n);
}
//Main Class extends helper class(abstract class)
public class CallingAbstractMethods extends MethodImplementation {
    public static void main(String[]args){
        //Creating instance of the class
        CallingAbstractMethods object = new CallingAbstractMethods();
        //Access Abstract Method
        object.check("A String is a representation of an object");
    }
    //Extend Abstract Method

    @Override
    void check(String n) {
        System.out.println(n);
    }
}

