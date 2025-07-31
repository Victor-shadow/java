package Annotation;
import java.lang.annotation.*;
//user defined Annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation
{
    String Language() default "Java";
    String ExpiryDate();
}//this is retained at runtime
//Driver class that uses Test Annotation

public class UserDefinedAnnotations {
    @TestAnnotation(Language = "Java", ExpiryDate = "01-10-20")
    void fun1(){
        System.out.println("Test method 1");
    }
    @TestAnnotation(Language = "Kotlin", ExpiryDate = "01-11-20")
    void fun2(){
        System.out.println("Test method 2");
    }
    public static void main(String[]args){
        System.out.println("Java is a high level object oriented programming language");
    }
}
