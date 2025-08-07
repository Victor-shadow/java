package enumeration;
import java.io.*;
 enum Months{
     JANUARY,
     FEBRUARY,
     MARCH,
     APRIL,
     MAY,
     JUNE,
     JULY,
     AUGUST,
     SEPTEMBER,
     OCTOBER,
     NOVEMBER,
     DECEMBER;
 }
 //Driver class
class EnumLoop {
     //Main Function
     public static void main(String[]args){
         //iterate over all the values in
         //enum using loop
         for (Months var_1: Months.values()){
             System.out.println(var_1);
         }
     }
}
