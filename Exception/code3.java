 import java.sql.*;
 class code3 
{
    public static void main(String[] args) 
    {
        // String s = null;
        // try{
        //     System.out.println(s.length());
        // }
        // catch(Exception e)
        // {
        //     e.printStackTrace();

        // }
        try {
            
        Class.forName("com.mysql.jdbc.driver");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        
    }
    
}
