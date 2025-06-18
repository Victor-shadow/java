package Classes;
//If the static method is redefined by a derived class
//then it is not overriding, it is hiding
class Superclass{
    //Static method in base class which will be hidden in subclass
    static void method1(){
        System.out.println("From Parent Class " + "static method1()");
    }
    //Non-static method which will be overridden in the derived class
    void method2(){
        System.out.println("From Parent Class: " + "non static-instance method2()");
    }
}
class DerivedClass extends Superclass{
    //This method hides method1() in the Superclass
    static void method1(){
        System.out.println("From Child class Static method()");
    }
    //This method overrides method2() in the Superclass
    @Override public void method2(){
        System.out.println("From Child Class " + "non-static instance method2() ");
    }
}

public class StaticMethodsCannotBeOverridden {
    public static void main(String[]args){
        //Create Child Object using Parent
        Superclass object = new DerivedClass();
        //Parent method1() is invoked since static methods cannot be overridden
        object.method1();
        //Overriding works  and Child method2() is called
        object.method2();
    }

}
