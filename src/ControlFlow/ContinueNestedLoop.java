package ControlFlow;

public class ContinueNestedLoop {
    public static void main(String[]args){
        //Outer loop for iteration
        for (int i = 1; i <= 4; i++){
            //Inner loop for iteration
            for (int j = 1; j <= 3; j++){
                //Continue Statement in inner loop
                //to skip execution if i = 3
                if (i == 3 && j == 2){
                    continue;
                }
                System.out.println(i+"."+j+ " ");
            }
            System.out.println();
        }
    }

}
