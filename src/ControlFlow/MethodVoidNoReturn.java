package ControlFlow;
//no return keyword required inside void method
class MethodVoidNoReturn {
    //method to calculate a reduced sum
    void calculate(int a, int b){
        int res = (a / b) / 10;
        System.out.println(res);
    }
    //Main driver method
    public static void main(String[]args){
        new MethodVoidNoReturn().calculate(500, 500);
        System.out.println("No return keyword is used, and program executed successfully");
    }


}
//return statement not required(but can be used) for methods with return type void
//we can use return which means no return
