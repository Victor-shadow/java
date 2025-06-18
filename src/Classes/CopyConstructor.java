package Classes;

// Class Definition
class CopyConstructor {
    // Data Members
    String name;
    int n;

    // Parameterized Constructor
    CopyConstructor(String name, int n) {
        this.name = name;
        this.n = n;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor otherObject) {
        this.name = otherObject.name;
        this.n = otherObject.n;
    }
}

// Main Class
class ConstructorMain {
    public static void main(String[] args) {
        System.out.println("First Object:");

        // Create original object using parameterized constructor
        CopyConstructor object = new CopyConstructor(
                "A Constructor is a special member function", 100);
        System.out.println("StringName: " + object.name + " Integer: " + object.n);
        System.out.println();

        // Create a second object using the copy constructor (passing object, not object1)
        CopyConstructor object1 = new CopyConstructor(object);

        System.out.println("Copy Constructor uses second object");
        System.out.println("Name: " + object1.name + " Int: " + object1.n);
    }
}