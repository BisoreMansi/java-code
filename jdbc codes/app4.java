package com.example;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
 class DeleteData  
 {
    public static void main(String[] args)  throws Exception{
        String url = "jdbc:mysql://localhost:3306/wipro";
        String user = "root";
        String pass = "12345678";
        String query = " Delete from customer where acc_no = 102 ";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
      st.execute(query);
      con.close();
        
    }
}



