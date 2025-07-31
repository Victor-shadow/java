package Annotation;

public class deprecatedAnnotation {
    @Deprecated
    public void display(){
        System.out.println("Deprecated display()");
    }
    public static void main(String[]args){
        deprecatedAnnotation obj = new deprecatedAnnotation();
        obj.display();
    }
}
