package ControlFlow;

public class ContinueWhileLoop {
    public static void main(String[]args){
        int c = 0;
        //while loop for iteration
        while (c <= 5){
            //continue used when c = 3
            if (c == 3){
                c++;
                continue;
            }
            System.out.println(c + " ");
            c++;
        }
    }

}
