package Classes;

class A1{
}
class B1 extends A1{
}
class C1 extends A1{
}

public class Inheritance extends B1 {
    public static void main(String[]args){
        A1 object = new A1();
        B1 e = new B1();
        C1 m = new C1();
        System.out.println(object instanceof A1 );
        System.out.println(e instanceof B1);
        System.out.println(m instanceof A1);

    }
}
