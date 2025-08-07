package ControlFlow;

public class NestedSwitchStatements {
    //Main Driver method
    public static void main(String [] args){
        //custom input stream
        String Branch = "CSE";
        int year = 2;

        //switch case
        switch (year){
            //case 1
            case 1:
                System.out.println("elective courses: Advance English, Algebra");
                //break statement to halt execution here if case is matched
                break;
            case 2:
                //Switch inside a switch
                switch (Branch){
                    //Nested case
                    case "CSE":
                    case "CCE":
                        System.out.println("elective courses: Machine Learning,Big Data");
                    break;

                    case "ECE":
                        System.out.println("elective courses: Antenna Engineering");
                    break;
                    //default case: it will execute if the above cases don't execute
                    default:
                        System.out.println("Elective courses: Optimization");
                }

        }
    }
}
