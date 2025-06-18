package Classes;
//MethodOverloading by changing DataTypes of Arguments
class Product1{
    //Multiply 3 integer values
    public int Multiply(int a, int b, int c){
        int output = a * b * c;
        return output;
    }
    public double Multiply(double a, double b, double c){
        double output = a * b * c;
        return output;
    }
}
class ChangingDataTypesOfArguments {
    public static void main(String[]args){
        Product1 object = new Product1();
        int product1 = object.Multiply(10, 20, 30);
        System.out.println("The product of three Integers: " + product1);
        double product2 = object.Multiply(100.5, 200.5, 300.5);
        System.out.println("The product of three double numbers is : " + product2);
    }
}
