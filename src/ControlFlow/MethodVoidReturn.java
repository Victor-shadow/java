package ControlFlow;

class MethodVoidReturn {
    //method to check a condition
    void check(double v){
        if (v < 9){
            return; //exit method if condition is met
        }
        v++;
    }
    //Main driver method
    public static void main(String[]args){
        MethodVoidReturn m = new MethodVoidReturn();
        m.check(5);
        System.out.println("Program executed successfully");
    }

}
