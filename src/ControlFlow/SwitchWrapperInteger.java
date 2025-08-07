package ControlFlow;

public class SwitchWrapperInteger {
    public static void main(String[]args){
        Integer age = 25;
        switch (age){//extract primitive value for switch
            case 25:
                System.out.println("You are 25");
            break;
            case 30:
                System.out.println("You are 30");
            break;
            default:
                System.out.println("Age not matched");

        }
    }
}
