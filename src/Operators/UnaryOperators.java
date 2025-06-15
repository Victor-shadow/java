package Operators;

class UnaryOperators {
    //Main Function
    public static void main(String[] args){
        //Declare an Integer
        int a = 10;
        int b = 10;

        //Use of Unary Operators
        System.out.println("PostIncrement " + (a++));
        System.out.println("PreIncrement " + (++a));

        System.out.println("PostDecrement " + (b--));
        System.out.println("PreDecrement " + (--b));

    }
}
