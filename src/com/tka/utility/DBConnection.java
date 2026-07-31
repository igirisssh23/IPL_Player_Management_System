package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static  String path = "com.mysql.cj.jdbc.Driver";
	private static Connection con = null;
	private static String url = "jdbc:mySql://localhost:3306/IPL_Project_DB?createDatabaseIfNotExist=true";
	private static String un = "root";
	private static String pass = "Girish@2301";
	public  static Connection getConnection() {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, un, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
