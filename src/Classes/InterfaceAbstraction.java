package Classes;

interface Abstract {
    double calculateArea(); //Abstract method for area calculation
}
//Implement the interface in a class named Circle
class ShapeA implements Abstract{
    private double r;
    //Constructor for circle
    public ShapeA(double r){
        this.r = r;
    }
    //Implement the abstract method from Abstract Interface

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
//Implement an interface in a class named rectangle
class ShapeB implements Abstract{
    private double length;
    private double width;
    //Constructor for Rectangle
    public ShapeB(double length, double width){
        this.length = length;
        this.width = width;
    }
    //Implement abstract method for Abstract Interface
    public double calculateArea(){
        return length * width;
    }
}
//Main class to test the program
public class InterfaceAbstraction{
    public static void main(String[]args){
        //Creation of Instance of Circle and Rectangle
        ShapeA c = new ShapeA(5.0);
        ShapeB r = new ShapeB(4.0, 7.0);
        System.out.println("Area of a circle: " + c.calculateArea());
        System.out.println("Area of a rectangle: " + r.calculateArea());
    }
}

