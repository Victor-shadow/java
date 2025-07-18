package Interfaces;
import java.lang.Cloneable;

//Making this class implement CloneableInterface
class Objects implements Cloneable {
    int a;
    //Class Constructor
    public Objects(int a){
        this.a = a;
    }

    //Overriding clone method by calling Object class method
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneableInterface{
    public static void main(String[]args) throws CloneNotSupportedException{
        Objects object = new Objects(20);
        //Cloning CloneableInterface and holding a new cloned object reference in b
        //Down-casting as clone() return type is object
        Objects b = (Objects) object.clone();
        System.out.println(b.a);

    }
}
