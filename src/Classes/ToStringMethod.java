package Classes;

class ToStringMethod {
    String n; //name
    //Constructor
    public ToStringMethod(String n){
        this.n = n;
    }
    //Override toString() for a custom string representation
    @Override
    public String toString(){
        return "String{name:'" + n + "'}";
    }
    public static void main(String[]args){
        ToStringMethod object = new ToStringMethod("Returns a string representation of an object");
        //Custom String representation
        System.out.println(object.toString());
        //Default hashCode value
        System.out.println(object.hashCode());

    }


}
