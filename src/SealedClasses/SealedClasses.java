package SealedClasses;
import java.lang.*;
sealed class A permits B, C, D {
    public void printName(){
        System.out.println("Default");
    }
}
non-sealed class B extends A{
    public void printName(){
        System.out.println("Java");
    }
}
non-sealed class C extends A{
    public void printName(){
        System.out.println("Kotlin");
    }
}
final class D extends A{
    @Override
    public void printName() {
        super.printName();
        System.out.println("Python");
    }
}
public class SealedClasses{
    public static void main(String[]args){
        A a1 = new D();
        A a2 = new C();
        A a3 = new B();
        a1.printName();
        a2.printName();
        a3.printName();

    }
}