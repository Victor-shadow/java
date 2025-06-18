package Classes;

class Baseclass{
    private void privateMethod(){
        System.out.println("It is a private method in the Parent Class");
    }
    public void publicMethod(){
        System.out.println("It is a public method in the Parent Class");
        //Calling Private Method
        privateMethod();
    }
}
class Subclass extends Baseclass{
    //A new method with the same name as the private method in the Superclass
    private void privateMethod(){
        System.out.println("This is a private method in the subclass");
    }
    //This method Overrides the public method in th parent class
    public void publicMethod(){
        //Calls the privateMethod() in the subclass and not the superclass
       System.out.println("It is a public method in the subclass.");
       privateMethod();
    }
}
public class PrivateMethodsCannotBeOverridden {
    public static void main(String[]args){
        Baseclass object = new Baseclass();
        //Invoke publicMethod in superclass
        object.publicMethod();
        Subclass object2 = new Subclass();
        //Invoke overridden public method in Subclass
        object2.publicMethod();
    }

}
