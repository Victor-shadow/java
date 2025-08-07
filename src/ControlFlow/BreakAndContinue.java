package ControlFlow;

 class BreakAndContinue {
   public static void main(String[]args){
       for (int i = 1; i <= 10; i++){
           //skip condition when i =3
           if (i == 3){
               continue;
           }
           //exit loop when i = 7
           if (i == 7){
               break;

           }
           System.out.println(i + " ");
       }
   }
}
