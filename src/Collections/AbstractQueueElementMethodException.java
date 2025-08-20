package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueElementMethodException {
    public static void main(String[]args) throws Exception{
        try{
            //Create AbstractQueue object
            AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<>();
            System.out.println("AbstractQueue: " + abstractQueue.element());

        }
        catch (Exception e){
            System.out.println("Exception is: " + e);
        }

    }
}
