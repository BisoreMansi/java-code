package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class InsertData 
{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/wipro";
        String user = "root";
        String pass = "12345678";
        String query = "INSERT INTO customer VALUES ('kuldeep', 25000, 'kull', 104)";

        Connection con = DriverManager.getConnection(url, user, pass);
         Statement st = con.createStatement();
       st.execute(query);
    }
    
}
