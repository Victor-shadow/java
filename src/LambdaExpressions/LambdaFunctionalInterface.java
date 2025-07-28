package LambdaExpressions;

//A simple functional interface(An interface with a single abstract method)
interface FuncInterface{
    //An Abstract Function
    void abstractFunc(int x);
    //a default function
    default void nonFunc(){
        System.out.println("Java");
    }
}

class LambdaFunctionalInterface{
    public static void main(String[]args){
        //lambda expression to implement the above functional interface
        //This interface by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2*x);
        //this calls the above lambda function and prints 10
        fobj.abstractFunc(5);
    }
}

