package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class project {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		

		String driverClassName = "com.mysql.jdbc.Driver";
			String	url = "jdbc:mysql://localhost:3306/training_db";
		String username ="root";
			String	password  = "root";

				Class.forName(driverClassName);
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println(con);
				
				String sql="insert into Emp(id,name)values(?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, 101);
				pst.setString(2,"Naresh");
				int rows = pst.executeUpdate();
				System.out.println("No of rows inserted:"+rows);
				
				String sql1 = "update Emp set name = ? where id = ?";
				PreparedStatement pst1 = con.prepareStatement(sql1);
				pst1.setString(1, "Naresh K");
				pst1.setInt(2, 101);

				int rows1 = pst1.executeUpdate();
				System.out.println("No of rows updated:"+rows1);
		         
				String sql2 = "delete from Emp where id = ?";
				PreparedStatement pst2 = con.prepareStatement(sql2);
				pst.setInt(1, 101);

				int rows2 = pst.executeUpdate();
				System.out.println("No of rows deleted:"+rows2);
				
				String sql3= "select id,name from Emp1";
				PreparedStatement pst3 = con.prepareStatement(sql3);
				ResultSet rs = pst3.executeQuery();
				while(rs.next()){
				   Integer id = rs.getInt("id");
				   String name = rs.getString("name");
				   System.out.println(id +"-" + name );
				}
				

	}

	

}
