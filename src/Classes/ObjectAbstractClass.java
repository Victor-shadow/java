//Algorithm for Implementing Abstraction
//- Define an abstract class (ObjectAbstraction)
//        - Declare an abstract method (Area()) for calculating the area.
//- Declare an abstract method (toString()) for string representation.
//        - Include a constructor to initialize common properties (e.g., color).
//        - Implement a concrete method (getColor()) for retrieving object color.
//- Create subclasses (Circle and Rectangle) that extend ObjectAbstraction
//- Each subclass inherits the properties and methods of ObjectAbstraction.
//- Implement the Area() method specific to each shape:
//        - Circle: Uses π × radius².
//        - Rectangle: Uses length × width.
//- Implement the toString() method to describe the shape.
//        - Use super() to invoke the constructor from the abstract class.
//        - Instantiate objects using the abstract class reference
//- Create instances of Circle and Rectangle using ObjectAbstraction type.
//- Print descriptions using toString().
//Step-by-step execution
//- Start
//- Define abstract class ObjectAbstraction
//- Declare attributes (e.g., color).
//        - Declare abstract methods (Area(), toString()).
//        - Implement constructor (super()) to initialize properties.
//- Implement concrete method (getColor()).
//        - Define Circle subclass
//- Implement Area() using Math.PI * radius².
//        - Implement toString() to display color and area.
//        - Define Rectangle subclass
//- Implement Area() using length * width.
//- Implement toString() to display color and area.
//        - Create main() method in ObjectAbstractClass
//- Instantiate a Circle object with color and radius.
//        - Instantiate a Rectangle object with color, length, and width.
//- Print object details using toString().

        package Classes;

// Abstract class defining common properties and methods
abstract class ObjectAbstraction {
    String color;

    // Abstract Methods
    abstract double Area();
    public abstract String toString();

    // Constructor in abstract Class
    public ObjectAbstraction(String color) {
        System.out.println("Object Abstraction Constructor called");
        this.color = color;
    }

    // Concrete method
    public String getColor() {
        return color;
    }
}

// Circle class extending ObjectAbstraction
class Circle extends ObjectAbstraction {
    double radius;

    public Circle(String color, double radius) {
        // Invoke ObjectAbstraction constructor
        super(color);
        System.out.println("Circle constructor called!");
        this.radius = radius;
    }

    @Override
    double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is: " + Area();
    }
}

// Rectangle class extending ObjectAbstraction
class Rectangle extends ObjectAbstraction {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        // Invoke ObjectAbstraction constructor
        super(color);
        System.out.println("Rectangle constructor called!");
        this.length = length;
        this.width = width;
    }

    @Override
    double Area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is: " + Area();
    }
}

// Test class for execution
public class ObjectAbstractClass {
    public static void main(String[] args) {
        ObjectAbstraction shape1 = new Circle("Red", 2.2);
        ObjectAbstraction shape2 = new Rectangle("Yellow", 100, 200);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}