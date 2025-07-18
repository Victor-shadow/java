package Interfaces;


interface DefaultMethods {
    final int a = 1000;
    default void display(){
        System.out.println("Use of Default method in an interface");
    }
}
//A class that implements the interface
class TestClass implements DefaultMethods{
    public static void main(String[] args){
        TestClass object = new TestClass();
        object.display();
    }
}
