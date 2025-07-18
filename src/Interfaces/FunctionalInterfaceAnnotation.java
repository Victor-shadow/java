package Interfaces;
//Define a functional Interface
@FunctionalInterface

interface Square{
    int calculate(int x);
}

class FunctionalInterfaceAnnotation {
    public static void main(String[]args){
        int a = 5;

        //Lambda expression to define the calculate method
        Square object = (int x) -> x * x;

        //Parameter passed and return type must be an integer
        int output = object.calculate(a);
        System.out.println(output);

    }
}
