package enumeration;
//enum is declared  outside any (enum keyword instead of class keyword)
enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET,
}

public class EnumOutsideClass{
    //driver method
    public static void main(String[]args){
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
