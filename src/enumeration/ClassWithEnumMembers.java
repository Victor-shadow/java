package enumeration;
import java.io.*;
import java.lang.runtime.SwitchBootstraps;

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
public class ClassWithEnumMembers{
    //enum member variable
    Day day;
    //constructor which takes enum value
    public ClassWithEnumMembers(Day day){
        this.day =day;
    }
    //method to execute action as per enum value
    public void informationOfTheWeek(){
        switch (day){
            case MONDAY:
                System.out.println("Monday is the first day of the week");
                break;
            case TUESDAY:
                System.out.println("Tuesday is the second day of the week");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday is the third day of the week");
                break;
            case THURSDAY:
                System.out.println("Thursday is the fourth day of the week");
                break;
            case FRIDAY:
                System.out.println("Friday is the fifth day of the week");
                break;
            case SATURDAY:
                System.out.println("Saturday is the sixth day of the week");
                break;
            case SUNDAY:
                System.out.println("Sunday is the religious day of the week");
                break;
            default:
                System.out.println("There are seven days of the week");
                break;
        }
    }

    public static void main(String[]args){
        ClassWithEnumMembers firstDay = new ClassWithEnumMembers(Day.MONDAY);
        firstDay.informationOfTheWeek();
        ClassWithEnumMembers secondDay = new ClassWithEnumMembers(Day.TUESDAY);
        secondDay.informationOfTheWeek();
        ClassWithEnumMembers thirdDay = new ClassWithEnumMembers(Day.WEDNESDAY);
        thirdDay.informationOfTheWeek();
        ClassWithEnumMembers fourthDay = new ClassWithEnumMembers(Day.THURSDAY);
        fourthDay.informationOfTheWeek();
        ClassWithEnumMembers fifthDay = new ClassWithEnumMembers(Day.FRIDAY);
        fifthDay.informationOfTheWeek();
        ClassWithEnumMembers sixthDay = new ClassWithEnumMembers(Day.SATURDAY);
        sixthDay.informationOfTheWeek();
        ClassWithEnumMembers seventhDay = new ClassWithEnumMembers(Day.SUNDAY);
        seventhDay.informationOfTheWeek();
    }
}
//in the main method new is used when creating instances of ClassWithEnumMembers since
//ClassWithEnumMembers is a regular Java class and not enum itself
//So, the new keyword is used to create new instance of ClassWithEnumMembers class and passing enum value to its constructors