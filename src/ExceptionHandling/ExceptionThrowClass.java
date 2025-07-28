package ExceptionHandling;

 class ExceptionThrowClass {
     static void fun() throws IllegalAccessException{
         System.out.println("Inside fun().");
         throw new IllegalAccessException("Exception is handled");
     }
     public static void main(String[]args){
         try {
             fun();
         }
         catch (IllegalAccessException e){
             System.out.println("Caught in main.");
         }
     }

}
