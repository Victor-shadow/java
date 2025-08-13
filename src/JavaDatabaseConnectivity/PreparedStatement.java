//package JavaDatabaseConnectivity;
//import java.sql.*;
//import java.util.Scanner;
//public class PreparedStatement {
//    public static void main(String[]args){
//        //try block to check for exceptions
//        try {
//            //Loading drivers using forName
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Scanner class to take input from the user
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("What country language do you want to search?");
//            //Reading country on primitive datatype from user
//            int percentage = scanner.nextInt();
//            //Register drivers using DriverManagers
//            Connection connection = DriverManager.getConnection("jdbc:mysql:///world", "root", "2005");
//            //Create a Prepared Statement
//            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("SELECT * FROM world.countrylanguage where percentage is ?");
//            // Execute the query
//            ((java.sql.PreparedStatement) preparedStatement).setInt(1, percentage);
//            ResultSet res = ((java.sql.PreparedStatement) preparedStatement).executeQuery();
//
//            //condition check using next method
//            while (res.next()){
//                System.out.println("Name: " + res.getString(1));
//            }
//        }
//        //catch block to handle exceptions to db if any
//        catch (SQLException e){
//         System.out.println(e);
//        }
//        catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//}
