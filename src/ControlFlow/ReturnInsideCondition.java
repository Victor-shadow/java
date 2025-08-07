package ControlFlow;

class ReturnInsideCondition {
    //method with void return type
    void demo(double v){
        //condition check
        if (v < 0){
            System.out.println(v);
            return;
        }
        else{
            v++;
        }
    }

    public static void main(String[]args){
        //invoke the method
        new ReturnInsideCondition().demo(-1);
        System.out.println("Program executed successfully");
    }
}
//the return statement allows the method to exit early when the condition is met
//avoiding the execution of the increment operation
