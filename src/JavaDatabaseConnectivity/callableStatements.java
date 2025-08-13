//package JavaDatabaseConnectivity;
//import java.sql.*;
//public class callableStatements {
//    public static void main(String[]args){
//        //Try block to check if any exceptions happen
//        try {
//            //Load and register the driver\
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Establish a connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql:///world", "root", "2005");
//            //Create a callable statement
//            CallableStatement callableStatement = connection.prepareCall("{call Get Language Info()}");
//            //Execute the stored procedure
//            ResultSet resultSet = callableStatement.executeQuery();
//            //process the results
//            while (resultSet.next()){
//                //print and display the elements
//                System.out.println("Language: " + resultSet.getString("Language"));
//                System.out.println("Percentage: " + resultSet.getInt("Percentage"));
//            }
//            //close the resources
//            connection.close();
//            callableStatement.close();
//            resultSet.close();
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}

//The use of callableStatement to execute a stored procedure
//It connects to a SQL Database  and prepares CallableStatement  to call a stored procedure
//with two parameters
//After executing the procedure, it runs a SELECT query to retrieve and display all records from the countrylanguage table
//ExceptionHandling is included to manage potential SQL and class loading errors