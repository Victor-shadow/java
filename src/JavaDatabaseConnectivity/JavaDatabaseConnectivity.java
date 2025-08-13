//package JavaDatabaseConnectivity;
//import java.sql.*;
//public class JavaDatabaseConnectivity {
//    public static void main(String[]args){
//        //Database URL, username and password
//        //Replace with database name
//        String url = "jdbc:mysql://localhost:3306/world";
//        //Replace with username
//        String username = "root";
//        //replace with MySQL Password
//        String password = "2005";
//        //Updated query syntax for modern databases
//        String query = "INSERT INTO country(Code, Name, Continent, Region) VALUES ('LB',Lebanon', 'MiddleEast', 'Eastern')";
//        //Establish JDBC connection
//        try{
//            //Load type-4 driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Establish connection
//            Connection connection = DriverManager.getConnection(url, username, password);
//            //create a statement
//            Statement statement = connection.createStatement();
//            //Execute the query
//            int count = statement.executeUpdate(query);
//            System.out.println("Number of rows affected by this query: " + count);
//            //close the connection
//            statement.close();
//            connection.close();
//            System.out.println("Connection closed");
//        }
//        catch (ClassNotFoundException e){
//            System.err.println("JDBC Driver not found: " + e.getMessage());
//        }
//        catch (SQLException e){
//            System.err.println("SQL Error: " + e.getMessage());
//        }
//
//    }
//}
