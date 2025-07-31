package Annotation;

class OverrideAnnotation {
    public void display(){
        System.out.println("Base Display()");
    }
    public static void main(String[]args){
        OverrideAnnotation obj = new Derived();
        obj.display();
    }
}

class Derived extends OverrideAnnotation{
    @Override
    public void display(){
        System.out.println("Derived display()");
    }
}
