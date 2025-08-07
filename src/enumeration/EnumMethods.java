package enumeration;

enum vegetables{
    CABBAGE,
    SPINACH,
    LETTUCE,
    TOMATOES,
    CAULIFLOWER,
    BROCCOLI;
    //enum constructor invoked separately for
    //each constant
    private vegetables(){
        System.out.println("Constructor called for: " + this.toString());
    }

    public void vegetableInfo(){
        System.out.println("Universal vegetable");
    }
}
public class EnumMethods {
  //driver method
    public static void main(String[]args){
        for (vegetables veg: vegetables.values()){
            System.out.println(veg);
        }
    }
}
//while the set of constants in a java enum is fixed at runtime and cannot be changed
//dynamically, you can modify the source code of the enum to add and then recompile the application
//to reflect these changes