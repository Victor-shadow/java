package ControlFlow;

public class SwitchVariableArgument {
    public static void main(String[]args){
        int x = 2;
        switch (x + 1){
            case 1:
                System.out.println(1);
            break;
            case 1 + 1:
                System.out.println(2);
            break;
            case 2 + 1:
            System.out.println(3);
            break;
            default:
                System.out.println("Default");
        }
    }
}
