package ControlFlow;

import java.util.IdentityHashMap;

class ReturnVoidMethod {
    //helper method with void return type
    void demoFunction(double n){
        //Exit method if condition is met
        if (n < 9) return;
        //increment the number otherwise
        n++;
    }
    //main method
    public static void main(String[]args){
        //Invoke the helper method
        new ReturnVoidMethod().demoFunction(100);
        System.out.println("Program executed successfully");
    }

}
