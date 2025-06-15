package Operators; // Ensuring a valid package declaration

// Removed unnecessary imports

class InstanceofOperator {
    public static void main(String[] args) {
        // Creating objects
        Person object1 = new Person();
        Person object2 = new Gender();

        // Checking instanceof relations
        System.out.println("object1 is instanceof Person: " + (object1 instanceof Person));
        System.out.println("object1 is instanceof Gender: " + (object1 instanceof Gender)); // false
        System.out.println("object1 is instanceof MyInterface: " + (object1 instanceof MyInterface)); // false

        System.out.println("object2 is instanceof Person: " + (object2 instanceof Person)); // true (Gender extends Person)
        System.out.println("object2 is instanceof Gender: " + (object2 instanceof Gender)); // true
        System.out.println("object2 is instanceof MyInterface: " + (object2 instanceof MyInterface)); // true (Gender implements MyInterface)
    }
}

// ✅ Correct class and interface declaration
class Person {}

class Gender extends Person implements MyInterface {

}

interface MyInterface {}