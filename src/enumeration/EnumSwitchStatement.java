package enumeration;
import java.util.Scanner;

//An Enum class
enum Planet{
    MERCURY,
    VENUS,
    MARS,
    EARTH,
    MAR,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}
//DRIVER CLASS THAT CONTAINS OBJECT OF PLANETS
public class EnumSwitchStatement {
    Planet planet;
    //constructor
    public EnumSwitchStatement(Planet planet){
        this.planet = planet;
    }
    //prints a line of a planet using switch
    public void planetIsLike(){
        switch (planet){
            case MAR -> System.out.println("Mars is the fourth planet");
            case EARTH -> System.out.println("Earth is the only planet that supports life");
            case SATURN -> System.out.println("This planet is known to be surrounded by rings");
            case VENUS -> System.out.println("This is the hottest plannet");
            case NEPTUNE -> System.out.println("This is the coldest planet since it is the farthest away from the sun");
            default -> System.out.println("There are 8 planets in the universe");
        }
    }

    public static void main(String[]args){
        String str = "NEPTUNE";
        EnumSwitchStatement e = new EnumSwitchStatement(Planet.valueOf(str));
        e.planetIsLike();
    }
}
