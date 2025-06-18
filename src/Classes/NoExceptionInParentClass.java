//package Classes;
////Overriding parent class method when an exception is not declared in the superclass
//
//class Super{
//    void method1(){
//        System.out.println("From parent method1()");
//    }
//    void method2(){
//        System.out.println("From parent method2()");
//    }
//}
//class Derived extends Super{
//    @Override
//    //No issue when throwing unchecked exception
//    void method1() throws ArithmeticException{
//        System.out.println("From child method1() ");
//    }
//    @Override
//    //compile-time error
//    //Issue when throwing checked exception
//    void method2()throws  Exception{
//        System.out.println("From child method2()");
//    }
//}
//
//class NoExceptionParentClass{
//    public static void main(String[]args){
//        Derived object = new Derived();
//        object.method1();
//    }
//}
//It shows that the superclass overridden method does not throw an exception
//The subclass overriding method can only throw the exception if the superclass does not declare the exception