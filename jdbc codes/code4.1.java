// import java.util.Scanner;
import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;



    class Implementation
    {
        public void selectEmployee()
        {
            String sql = " select id, name, email,country, salary from employes where id = ?";
           try {
            Connection conn = JDBCutils.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
                pstmt.setInt(1,1);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println("ID" + rs.getInt("id"));
                    System.out.println("Name : "+ rs.getString("name"));
                    System.out.println("email :"+ rs.getString("email"));
                    System.out.println("Country :"+ rs.getString("country"));
                    System.out.println("Salary :"+ rs.getDouble("salary"));
                    
                }
            
            
           } catch (SQLException e) {
            JDBCutils.PrintSqlException(e);
            
           }

        }

        public void inserEmployee()
        {
            String sql = " insert into employes (name,email,country,salary)values(?,?,?,?) ";
            try {
                Connection conn = JDBCutils.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                conn.prepareStatement(sql);
                
                    pstmt.setString(1, "john Doe");
                    pstmt.setString(2, "john.doe@example.com");
                    pstmt.setString(3, "USA");
                    pstmt.setDouble(4, 82378);
                    pstmt.executeUpdate();
                    System.out.println("Record Create");
                
            } catch (SQLException e) {
               JDBCutils.PrintSqlException(e);
            }
        }

        public void UpdateEmployee()

        {
            String sql = "update employes set name = ?, email = ?,country = ?,salary = ? where id = ?";
            try {
               Connection conn =  JDBCutils.getConnection();
               PreparedStatement pstmt = conn.prepareStatement(sql);
               
                pstmt.setString(1, "sonu");
                pstmt.setString(2, "sonu@abc.com");
                pstmt.setString(3, "canada");
                pstmt.setDouble(4,8489);
                pstmt.setInt(5, 1);
                pstmt.executeUpdate();
                System.out.println("Record Update");




               
             
                
            } catch (SQLException e) {
                JDBCutils.PrintSqlException(e);
                
            }
        }
         
        public void DeleteEmployee()
        {
            String sql = " Delete from employes where id = ?";
            try {
                Connection conn = JDBCutils.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1,1);
                pstmt.executeUpdate();
                System.out.println("Record Delete");

            } catch (SQLException e) {
                JDBCutils.PrintSqlException(e);
            }
        }
    
        public static void main(String[] args) {
            int choice;
            Implementation i = new Implementation();
            System.out.println("WELCome to Our Organization \n Please ! Enter Your Choice");
            System.out.println( " 1 .View Employee \n 2.Add New employee \n 3. Update Data of Employee \n 4. DElete the data of employee \n 5. Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:i.selectEmployee();
                break;
                    
                case 2:i.inserEmployee();
                break;

                case 3:i.UpdateEmployee();
                break;
                case 4:i.DeleteEmployee();
                break;
                case 5:System.exit(choice);
                break;
            
                default:
                    break;
                  
            }


            sc.close();

        }
    
    }
