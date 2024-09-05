package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;



class PrintMultipleData 
 {
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/wipro";
        String user = "root";
        String pass = "12345678";
        String query = "select * from customer" ;

        Connection con = DriverManager.getConnection(url, user, pass);
         Statement st = con.createStatement();
       ResultSet rs =  st.executeQuery(query);
       while (rs.next()) 
       {
        System.out.println(rs.getString("cname") +"-" 
        +rs.getInt("balance")+" -"
         + rs.getString("passcode")+"-"
         + rs.getInt("acc_no"));
        
       }
      
       con.close();



        
    }
    
}

     
       



        
    
    

