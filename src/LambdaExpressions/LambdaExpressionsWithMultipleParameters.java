package LambdaExpressions;
@FunctionalInterface
interface Functional{
    int operation(int a, int b);
}
public class LambdaExpressionsWithMultipleParameters {
  public static void main(String[]args){
      //using lambda expressions  to define the operations
      Functional add = (a, b) -> a + b;
      Functional multiply = (a, b) -> a*b;
      //Using the operations
      System.out.println(add.operation(100, 200));
      System.out.println(multiply.operation(1000, 2000));
  }
}
//Lambda Expressions are just like functions that take parameters