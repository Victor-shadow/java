package loops;
//Java program to illustrate one time iteration inside a do-while loop
//when condition is not satisfied
class DoWhile {
    public static void main(String[]args){
        //initial counter variable
        int c = 0;
        do {
            //body of the loop that will execute minimum
            //1 time for sure
            System.out.println("Print Statement");
            c++;
        }
        //checking condition
        //it is being checked after one minimum iteration
        while (c < 0);
    }

}
//the condition is being checked later as the body inside do will get executed once without fail
//as the condition is checked later onwards