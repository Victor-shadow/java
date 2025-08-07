package ControlFlow;

public class Continue {
    public static void main(String[]args){
        //For loop iteration
        for (int i = 0; i <=5; i++){
            //check condition for continue
            //skips the execution of the loop if i = 3
            if (i == 3){
                continue;

            }
            System.out.println(i + " ");
        }
    }
}
