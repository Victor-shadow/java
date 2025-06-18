package Classes;
//hierarchical inheritance
class Superior{
    void method1(){
        System.out.println("Inside Superior method!");
    }
}
class Inheritor extends Superior{
    //Overriding method1()
    void method1(){
        System.out.println("Inside Inheritor method!");
    }
}
class Inheritor2 extends Superior{
    //Overriding method1
    void method1(){
        System.out.println("Inside inheritor2 method!");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[]args){
        //Object of class Main
        Superior object = new Superior();
        //Object of second class
        Inheritor object1 = new Inheritor();
        //Object of third class
        Inheritor2 object2 = new Inheritor2();

       // Obtain reference for super class
        Superior ref;
        //ref refers to a super class object
        ref = object;
        //Call Superior version of m1()
        ref.method1();
        //Ref refers to a subclass object
        ref = object1;
        //Call Inheritor version of m1()
        ref.method1();
        //Ref refers to a subclass object
        ref = object2;
        //Call Inheritor2 version of m1
        ref.method1();
    }
}

