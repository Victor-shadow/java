package ControlFlow;

public class ContinueDoWhileLoop {
    public static void main(String[]args){
        int i = 0;
        //do while loop for iteration
        do {
            //Continue statement used when
            //i = 3
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i + " ");
            i++;
        } while (i <= 5);

    }
}
