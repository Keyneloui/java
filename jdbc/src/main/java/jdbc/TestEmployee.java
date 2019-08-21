package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestEmployee {
	
	public static  Connection getConnection()
	{
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String	url = "jdbc:mysql://localhost:3306/training_db";
	    String username ="root";
		String	password  = "root";
		Connection con= null;
		
		try {
			Class.forName(driverClassName);
			 con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driverClassName = "com.mysql.jdbc.Driver";
		String	url = "jdbc:mysql://localhost:3306/training_db";
	    String username ="root";
		String	password  = "root";

			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
		// TODO Auto-generated method stub
		
	}
	}

	

