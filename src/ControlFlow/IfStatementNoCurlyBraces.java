package ControlFlow;

class IfStatementNoCurlyBraces {
    public static void main(String[]args){
        int i = 10;
        if (i < 15)
            //part of the if block(immediate  one statement after if condition)
            System.out.println("Inside if block");
        //always executes as it is outside the if block
        System.out.println("10 is less than 15");
        //This statement will be executed as if considers one statement by default again
        //below statement is outside if block
        System.out.println("I am not inside if block");
    }

}
