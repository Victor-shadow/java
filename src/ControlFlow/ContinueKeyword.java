package ControlFlow;

class ContinueKeyword {
    public static void main(String[]args){
        for (int i = 0; i < 10; i++){
            if (i == 6){
                System.out.println();
                //use continue keyword to skip  current iteration
                continue;
            }
            System.out.println();
        }

    }
}
//when the value of i = 6 the compiler encounters the continue statement and then 6 is skipped