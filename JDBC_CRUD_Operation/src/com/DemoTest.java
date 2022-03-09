package com;
import java.sql.*;

public class DemoTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jbbc:mysql://localhost:3305/my_database", "root", "Gopiraj@1");
		System.out.println("Database connected...");
		Statement stmt = con.createStatement();
		int res = stmt.executeUpdate("insert into employee values(5, 'Mahesh' ,22000)");
		if(res>0) {
			System.out.println("Record inserted successfully");
			
		}
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
