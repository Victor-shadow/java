package enumeration;

public class EnumInsideClass {


    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    //Driver method
    public static void main(String[]args){
        for (Day d : Day.values()) {
            System.out.println(d); // This prints MONDAY, TUESDAY, ..., SUNDAY
        }

    }
}
//the first line inside the enum should be a list of constants and then other things like methods, variables
//and constructors
//The constants should be named with capital letters