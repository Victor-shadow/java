package Methods;

//The class has a default Access Modifier
public class DefaultAccessModifier {
    void display(){
        System.out.println("This is a Default Access Modifier");
    }
public static void main(String[]args){
        DefaultAccessModifier object = new DefaultAccessModifier();
        object.display();
}
}
