package ControlFlow;

public class EnumSwitchStatement {
    //enum
    public enum Day{Sun, Mon, Tue, Wed, Thur, Fri, Sat}
    //Main driver method
    public static void main(String [] args){
        //Enum
        Day [] dayNow  = Day.values();
        //iterate using for loop
        for (Day Now: dayNow){
            //switch case
            switch (Now){
                //Case 1
                case Sun:
                    System.out.println("Sunday");
                    //break statement that halt further execution
                    //once case is satisfied
                    break;

                case Mon:
                    System.out.println("Monday");
                    break;

                case Tue:
                    System.out.println("Tuesday");
                    break;

                case Wed:
                    System.out.println("Wednesday");
                    break;

                case Thur:
                    System.out.println("Thursday");
                    break;

                case Fri:
                    System.out.println("Friday");
                    break;

                case Sat:
                    System.out.println("Saturday");
                    break;

            }
        }

    }

}
