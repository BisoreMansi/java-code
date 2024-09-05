package com.example;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
 class UpdateData  
 {
    public static void main(String[] args)  throws Exception{
        String url = "jdbc:mysql://localhost:3306/wipro";
        String user = "root";
        String pass = "12345678";
        String query = " update customer set cname = 'pallavi' where acc_no = 103 ";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
      st.execute(query);
      con.close();
        
    }
}
