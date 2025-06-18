package Classes;

class StaticBinding {
    // Static nested inner class
    public static class SuperClass {
        static void print() {
            System.out.println("print() in SuperClass is invoked");
        }
    }

    // Another static nested inner class
    public static class SubClass extends SuperClass {
        static void print() {
            System.out.println("print() in SubClass is invoked");
        }
    }

    public static void main(String[] args) {
        SuperClass A = new SuperClass();
        SuperClass B = new SubClass();

        A.print();             // SuperClass's print()
        B.print();             // Still SuperClass's print(), due to static binding
        // SubClass's print()
    }
}
//In both cases the print method of the super class is called
//=An Object of the superclass with the reference to the subclass has been created together with an object
//of the subclass
//Since the print method of the superclass is static, the compiler notes that it will not be overridden in the subclasses
