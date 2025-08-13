//package JavaDatabaseConnectivity;
//import java.sql.*;
//public class Statement {
//    public static void main(String[]args){
//        try{
//            //Loading drivers using forName
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //Establish the connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "2005");
//            //Create a statement
//            java.sql.Statement statement = connection.createStatement();
//            //Execute a query
//            String sql = "SELECT * FROM world.country";
//            ResultSet resultSet = statement.executeQuery(sql);
//            //process the result
//            while (resultSet.next()){
//                System.out.println("Name: " + resultSet.getString("name") + ", Continent: " + resultSet.getInt("continent"));
//            }
//            //close the resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
