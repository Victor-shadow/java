package Classes;

class UniqueParent{
    //private methods are not overridden
    private void m1(){
        System.out.println("From Parent m1()");
    }
    protected  void m2(){
        System.out.println("From parent m2()");
    }
}
class UniqueChild extends UniqueParent{
    //New m1() method unique to child class
    private void m1(){
        System.out.println("From Child m1()");
    }
    //Override method with more accessibility
    @Override public void m2(){
        System.out.println("From child m2()");
    }
}

public class AccessModifiersAndOverridingMethods {
    public static void main(String[]args){
        //Parent class Object
        UniqueParent P = new UniqueParent();
        P.m2();
        UniqueParent C = new UniqueChild();
        C.m2();
    }

}
//The parent class is overridden by the child class
