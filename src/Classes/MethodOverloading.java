package Classes;

public class MethodOverloading {
    // Overloaded sum method() takes two int parameters
    public int sum(int x, int y){
        return x + y;
    }

    // Overloaded sum method() takes three int parameters
    public int sum(int x, int y, int z){
        return x + y + z;
    }

    // Overloaded sum method() takes two double parameters
    public double sum(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading object = new MethodOverloading();
        System.out.println(object.sum(100, 200));
        System.out.println(object.sum(1000, 2000, 3000));
        System.out.println(object.sum(100.5, 200.5));
    }
}