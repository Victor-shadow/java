package Classes;

class ParameterizedConstructor {
    String name;
    int n;

    ParameterizedConstructor(String name, int n){
        this.name = name;
        this.n = n;
    }
}
class Main{
    public static void main(String[]args){
        ParameterizedConstructor object = new ParameterizedConstructor("A object that stores a sequence of characters ", 12345);
        System.out.println("String Name: " + object.name + "Integer: " + object.n );
    }
}
