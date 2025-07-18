package Multithreading;
import java.lang.*;
class ThreadSleepMethodIllegalArgumentException {
    public static void main(String[]args){
        //use throws keyword followed by the exception name for throwing the Exception
        try{
            for (int i = 0; i < 5; i++){
                //This will throw IllegalArgumentException
                Thread.sleep(-100);
                //print the value of variable
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
