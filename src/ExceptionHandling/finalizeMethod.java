//package ExceptionHandling;
//import java.util.*;
//public class finalizeMethod {
//    public static void main(String[]args){
//        finalizeMethod f = new finalizeMethod();
//        System.out.println("Hashcode is: " + f.hashCode());
//        //Making an object eligible for garbage collection
//        f = null;
//        System.gc();
//        //Allow a short delay to allow GC to act
//        try {
//            Thread.sleep(1000);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println("End of garbage collection.");
//    }
//    //Define the finalize method
//    @Override protected void finalize(){
//        System.out.println("Called the finalize() method");
//    }
//
//}
