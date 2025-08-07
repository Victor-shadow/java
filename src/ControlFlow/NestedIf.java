package ControlFlow;

class NestedIf {
   public static void main(String[]args){
       int a = 10;
       int b = 20;
       //outer if condition
       if (a == 10){
           if (b == 20){
               System.out.println("Inner if statement block");
           }
       }
   }
}
//one if condition is placed inside another
//if both conditions are true it prints "Inner if statement block"
