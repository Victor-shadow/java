package Annotation;

class SuppressWarningAnnotation {
  @Deprecated
    public void display(){
      System.out.println("Deprecated test Display()");

  }
}

public class SuppressWarningAnnotations{
    //if we comment below annotation, the program generates a warning
    @SuppressWarnings({"checked","deprecations"})
    public static void main(String[]args){
        SuppressWarningAnnotation obj = new SuppressWarningAnnotation();
        obj.display();
    }
}
