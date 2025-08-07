package ControlFlow;

public class If {
    public static void main(String[]args){
        boolean a = true;
        boolean b = false;

        if (a){
            System.out.println("a is true");
        }else{
            System.out.println("a is false");
        }

        if (b){
            System.out.println("b is true");
        }
        else{
            System.out.println("b is false");
        }

    }
}
//The code starts with the declaration of two Boolean variables a and b, with a set to true
//and b is set to false
//The first if-else statement checks the value of a. If the value of a is true, the
//code inside the first set of curly braces {} is executed and the message "a is true"
//is printed to the console. If the value of 'a' is false, the code inside the second set of curly braces{}
//is executed and the message "a is false" is printed to the console
//The second if-else statement checks the value of b in the same way
//If the value of b is true, the message "b is true" is printed to the console. If the value of b is false
//the message "b is false" is printed to the console