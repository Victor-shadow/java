package ControlFlow;

public class BreakLabel {
    public static void main(String[]args){

        boolean t = true;
        //label first
        first:{
            second:{
             third: {
                System.out.println("Before break statement");
                if (t){
                    break second;
                }
                System.out.println("This won't execute");
             }
             System.out.println("This won't execute");
            }
            System.out.println("After second block");
        }
    }
}
//The program enters the first labeled block It moves into the second labeled block and then
//into the third labeled block
//when t is true it breaks the second label;exits the second block by skipping all further code
//within it
//The program then prints "After second block"