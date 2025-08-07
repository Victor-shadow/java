package ControlFlow;

class ContinueStatement {
    public static void main(String[]args){
        for (int i = 0; i < 10; i++){
            //If the number is even
            //skip and continue
            if (i % 2 == 0){
                continue;
            }
            //if the number is odd print
            System.out.println(i + " ");
        }
    }

}
