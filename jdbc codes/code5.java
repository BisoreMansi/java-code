import java.sql.*;
 class GFG 
{
    public static void main(String arg[])
    {
        Connection connection = null;
        try 
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "12345678");
 
           
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from employess");
               // resultSet=statement.executeQuery("select address from student");
            int emp_Id;
            String name;
            String design;
            String n="raju";
            
            while (resultSet.next()) {
                if(resultSet.getString("name").equals(n))
                {
                emp_Id= resultSet.getInt("emp_Id");
                name = resultSet.getString("name").trim();
               design=resultSet.getString("design");
                System.out.println("sno: " + emp_Id + " name : " + name + " address : "+design);
            }
        
            else{
                System.out.println("Not found");
            }
        }
        
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) 
        {
            System.out.println(exception);
        }
    } 
}