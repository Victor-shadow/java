package ControlFlow;

class MethodReturn {
    //method to calculate average
    double avg(double x, double y){
        double res = (x + y) / 2.0;
        return res;
    }
    //Main driver method
    public static void main(String[]args){
        System.out.println(new MethodReturn().avg(5.55,6.66));
    }

}
//when the method avg is invoked, it computes the average of the inputs and returns the result
//which is printed to the console
