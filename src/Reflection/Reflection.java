package Reflection;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

 class Emp{
    private int eid;
    private  double esal;
    private  String ename;

    enum Week{
        SUN,TUE,WED
    }
    @interface myAnno{}

    public int getEid(){
        return eid;
    }

    public double getEsal() {
        return esal;
    }
    public String getEname(){
        return ename;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }
    //constructor
    public Emp(int eid, double esal, String ename){
        super();
        this.eid = eid;
        this.esal = esal;
        this.ename = ename;
    }
    Emp(){

    }
    class A{

    }
    class B{

    }
}
public class Reflection {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("Reflection.Emp");

        // Constructor info
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Name of constructor: " + constructor);
            System.out.println("Count of constructor parameter: " + constructor.getParameterCount());

            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Constructor's parameter: " + parameter);
            }
            System.out.println();
        }

        // Method info
        Method[] methods = c.getDeclaredMethods();
        System.out.println("Length of methods: " + methods.length);
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println("Parameter count: " + method.getParameterCount());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Method's parameter: " + parameter);
            }
            System.out.println();
        }

        // Inner classes
        Class<?>[] classes = c.getDeclaredClasses();
        for (Class<?> class1 : classes) {
            System.out.println("Class: " + class1);
            System.out.println("Name of class: " + class1.getName());
        }

        // Annotations
        Annotation[] anno = c.getDeclaredAnnotations();
        for (Annotation annotation : anno) {
            System.out.println("Annotation: " + annotation);
        }
    }
}
