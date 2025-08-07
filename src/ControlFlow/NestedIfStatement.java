package ControlFlow;

class NestedIfStatement {
    public static void main(String[]args){
        int i = 10;
        if (i == 10 || i < 15){
            //First if statement
            if (i < 15){
                System.out.println("i is smaller than 15");
                //nested if statement
                //will only be executed if statement above
                //is true
                if (i < 12){
                    System.out.println("i is smaller than 12");
                }
                else{
                    System.out.println(" i is greater than 15");
                }
            }
        }
    }
}
