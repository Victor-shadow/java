package Classes;

class A{
    public void print_A(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void print_B(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void print_C(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void print_D(){
        System.out.println("Class D");
    }
}
//Main Class
public class HierarchicalInheritance {
    public static void main(String[]args){
        B object_B = new B();
        object_B.print_A();
        object_B.print_B();

        C object_C = new C();
        object_C.print_A();
        object_C.print_C();


        D object_D = new D();
        object_D.print_A();
        object_D.print_D();


    }
}
