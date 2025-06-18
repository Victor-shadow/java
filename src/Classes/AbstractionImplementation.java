package Classes; // Define the package at the top

// Abstract class defining essential methods to be implemented and hides implementation details
abstract class Abstraction {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
//The Switch class provides specific implementation of abstract methods
class Switch extends Abstraction {
    @Override
    void turnOff() {
        System.out.println("The Switch is turned off!");
    }

    @Override
    void turnOn() {
        System.out.println("The Switch has been turned on!");
    }
}
// Corrected Implementation class
public class AbstractionImplementation {
    public static void main(String[] args) {
        Abstraction mySwitch = new Switch(); // Using a valid variable name
        mySwitch.turnOff();
        mySwitch.turnOn();
    }
}