import java.util.Scanner;
import java.sql.*;

class JDBCutils
{
    public static final String  url = "jdbc:mysql://localhost:3306/test_db?useSSL=false";
    public static final String user = "root";
    public static final String password = "12345678";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url, user, password);
    } 


public static void PrintSqlException(SQLException ex)
{
    for(Throwable e : ex)
    {
        if(e instanceof SQLException)
        {
            e.printStackTrace(System.err);
            
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }

        }

    }
}