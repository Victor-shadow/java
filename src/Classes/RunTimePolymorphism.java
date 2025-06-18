// Java program to demonstrate method overriding in Java
package Classes;

// Base class or superclass
class ParentA {
    // Method to be overridden
    void show() {
        System.out.println("Parent class method overridden: show()");
    }
}

// Inherited class
class ChildClassA extends ParentA {
    // Overriding the show() method of ParentA
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

// Driver class
class RunTimePolymorphism {
    public static void main(String[] args) {
        // Reference to a parent object
        ParentA object1 = new ParentA();
        object1.show();

        // Reference to a child object (polymorphism in action)
        ParentA object2 = new ChildClassA();
        object2.show();
    }
}
//The Child Class inherits from the Parent class and overrides the show() method providing its own implementation
//When a Parent Reference points to a Child Object the child's overridden method is executed at runtime