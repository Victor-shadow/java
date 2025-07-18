package Interfaces;


interface StaticMethods {
    final int b = 1000;
    static void display(){
        System.out.println("Static Methods in an interface");
    }
}
//A class that implements the interface
class OutputClass implements  StaticMethods{
    public static void  main(String[] args){
        StaticMethods.display();
    }
}
