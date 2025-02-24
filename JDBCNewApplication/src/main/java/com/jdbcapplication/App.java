package com.jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codinghub","root","root");
    	PreparedStatement pst = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
    	pst.setInt(1, 101);
    	pst.setString(2, "oil");
    	pst.setDouble(3, 720);
    	pst.setDouble(4, 3.5);
    	pst.executeUpdate();
    	System.out.println("Inserted Successfully");
        
    }
}
