package com.sunbeam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbUtil 
{
	private static String DB_DRIVER="com.mysql.cj.jdbc.Driver";
	private static String DB_URL="jdbc:mysql://localhost:3306/java_db";
	private static String DB_USER="kd3_80149_anitaparmar";
	private static String DB_PASSWORD="manager";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return con;
	}
}
