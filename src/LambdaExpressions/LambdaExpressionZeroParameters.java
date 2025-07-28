package LambdaExpressions;
@FunctionalInterface
interface ZeroParameter{
    void display();
}

public class LambdaExpressionZeroParameters {
    public static void main(String[]args){
        //Lambda Expression with zero params
        ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero parameter lambda expression");
        //Invoke the method
        zeroParamLambda.display();
    }
}
