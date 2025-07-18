package Interfaces;

public class MainNestedInterface {
    //Nested Interface
    public interface NestedInterface{
        public void nestedMethod();
    }

    public static void main(String[]args){
        //Implement the nested interface
        NestedInterface nested = new NestedInterface() {
            @Override
            public void nestedMethod() {
                System.out.println("This is a nested interface");
            }
        };
        //Invoke nested Interface
        nested.nestedMethod();
    }
}
//We have a nested Interface inside the outer class. We then implement the interface using an anonymous inner class
//in the main method and calls its method nestedMethod()