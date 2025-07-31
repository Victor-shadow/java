package Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//use target annotation to annotate a type
@Target(ElementType.TYPE_USE)

//declare a simple type annotation
@interface TypeAnno{}

public class TypeAnnotation {
    //main driver method
    public static void main(String[]args){
        //Annotate the type of String
        @TypeAnno String s = "I am annotated with a type annotation";
        System.out.println(s);
        abc();
    }
    //annotating return type of function
    static @TypeAnno int abc(){
        System.out.println("This function return type is annotated");
        return 0;
    }


}
