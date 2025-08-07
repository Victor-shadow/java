package loops;

public class InfiniteEmptyForLoop {
    public static void main(String[]args){
        for (;;){
            System.out.println("Infinite for loop");
        }
    }
}
//A "TimeLimitExceeded" error occurs  when the program runs longer than the time allocated for execution
//due to infinite loops