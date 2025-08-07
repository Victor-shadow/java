package Annotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//make Words annotation repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface Words{
    String word() default "Hello";
    int value() default 0;
}

//create container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface  MyRepeatedAnnos{
    Words[] value();
}

public class repeatableAnnotation {
    //Repeat words on new methods
    @Words(word = "First", value = 1)
    @Words(word = "Second", value = 2)
    public static void newMethod(){
        repeatableAnnotation obj = new repeatableAnnotation();
        try {
            Class<?> c = obj.getClass();
            //obtain the annotation for the new method
            Method m = c.getMethod("newMethod");
            //display the Repeated Annotation
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }
        catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        newMethod();
    }
}


