package ControlFlow;

class BreakSwitch {
    public static void main(String[]args){
        //assign n as an integer
        int n = 1;
        //passing n to switch
        switch (n){
            case 1:
                System.out.println("switch one");
            break;
            case  2:
                System.out.println("switch two");
            break;
            default:
                System.out.println("default case");
        }
    }

}
//the switch statement is evaluated with n = 1;
//The first case 1 matches and prints "switch one"
//the break statement is executed and the program exits the switch block
//and skips any remaining cases