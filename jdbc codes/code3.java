 //if user give a name and name will be exactly same then we give a information 
 import java.sql.*;
 import java.util.Scanner;
 class Code3 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a name");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        Connection connection = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank_db",
                "root", "12345678");

                
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select name,emp_Id from employess");
            int emp_Id;
            String name;
            while (resultSet.next()) {
                if(resultSet.getString("name").equals(input))
                {
                      emp_Id = resultSet.getInt("emp_Id");
                name = resultSet.getString("name").trim();

                System.out.println("emp_Id : " + emp_Id
                                   + " name : " + name);

                }
                else{
                    System.out.println("USer not found");
                }
                
                
              
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
 

        

        
    }
    
}
