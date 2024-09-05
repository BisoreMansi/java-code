package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class InsertDataByePrepared
 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/wipro";
        String user = "root";
        String pass = "12345678";
        String query = "insert into customer values(?,?,?,?)";

        
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pr = con.prepareStatement(query);
        pr.setString(1, "arpit");
        pr.setInt(2,2131);
        pr.setString(3,"arpita");
        pr.setInt(4,102);
        pr.execute();
        con.close();
    }
    
}
