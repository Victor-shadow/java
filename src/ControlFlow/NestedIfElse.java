package ControlFlow;
class NestedIfElse {
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        //outer if condition
        if (a == 10){
            //Inner if condition
            if (b != 20){
                System.out.println("Nested if statement block");
            }
            else {
                System.out.println("Outer else statement");
            }
        }
    }

}
//it first checks if a is equal to 10
//If the condition satisfies, it then checks the inner condition b!= 20
//If the inner condition is false, the else block executes