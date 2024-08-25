//Java program to set up connection and get all data from table
//Read Data
import java.sql.*;
 
 class GFG {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank_db",
                "root", "12345678");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from employess");
            int emp_Id;
            String name;
            while (resultSet.next()) {
                emp_Id = resultSet.getInt("emp_Id");
                name = resultSet.getString("name").trim();
                System.out.println("emp_Id : " + emp_Id
                                   + " name : " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends