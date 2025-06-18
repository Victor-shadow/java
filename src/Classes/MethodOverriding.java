package Classes;
//Helper class
class Parent{
    //Method Of Parent Class
    void Print(){
        System.out.println("This is the parent class");
    }
}
//Class 2
class subclass1 extends Parent{
    //Method
    void Print(){
        System.out.println("Subclass 1");
    }
}
//Class 3
class subclass2 extends Parent{
    //Method
    void Print(){
        System.out.println("Subclass 2");
    }
}
//Main Class

class MethodOverriding {
    //Main Method
    public static void main(String[]args){
        //When an object of a child class is created then the method inside the child class is called
        //This is because the method in the parent class is overridden by the child class hence the body inside the child class
        //is executed since the child method now has more priority over the parent method
        //Create object of class 1
        Parent a;
        //Call print methods inside main method
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }

}
