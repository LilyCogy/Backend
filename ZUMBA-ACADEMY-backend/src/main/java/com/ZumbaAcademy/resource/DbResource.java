package com.ZumbaAcademy.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	static Connection con;
	//this block call only once to connect the database.
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caltech_course2_db","root","Lily_bae4812"); 
		
		} catch (Exception e) {
			System.err.println("Db Connection error" +e.toString());
		}
	
	}
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println("Db Connection getting error" +e.toString());
		}
		return null;
	}
}
