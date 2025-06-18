package Classes;
//Method overloading by ChangingOrderOfParameters
class User{
    //Method 1
    public void UserId(String name, int age){
        System.out.println("Name: " + name + " " + "Age-no " + age);
    }
    //Method 2
    public void UserId(int age, String name){
        System.out.println("Name: " + name + " " + "Age-no " + age);
    }
}
//Main class
class ChangingOrderOfParameters {
    public static void main(String[]args){
        //Create object of the class
        User object = new User();
        //Pass name and ID in reverse order
        object.UserId("DevOpsEngineer ", 20);
        object.UserId(50, "Software Engineer ");
    }

}
