package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

	Connection con = TestEmployee.getConnection();
	public static void insert(int id,String name) throws ClassNotFoundException, SQLException
	{
		Connection con = TestEmployee.getConnection();
		String sql="insert into Employ(id,name)values(?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2,name);
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted:"+rows);

		
	}
	public static void update(int id,String name) throws ClassNotFoundException, SQLException
	{
		Connection con=TestEmployee.getConnection();
		String sql1 = "update Employ set name = ? where id = ?";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setString(1, name);
		pst1.setInt(2, id);

		int rows1 = pst1.executeUpdate();
		System.out.println("No of rows updated:"+rows1);
		
	}
	public static void delete(int id)throws ClassNotFoundException,SQLException
	{
		Connection con =TestEmployee.getConnection();
		String sql2 = "delete from Employ where id = ?";
		PreparedStatement pst2 = con.prepareStatement(sql2);
		pst2.setInt(1, id);

		int rows2 = pst2.executeUpdate();
		System.out.println("No of rows deleted:"+rows2);
		
	}
	public static void select() throws ClassNotFoundException, SQLException
	{
		Connection con =TestEmployee.getConnection();
	
	String sql3= "select id,name from Employ";
	PreparedStatement pst3 = con.prepareStatement(sql3);
	ResultSet rs = pst3.executeQuery();
	while(rs.next()){
	   Integer id1 = rs.getInt("id");
	   String name1 = rs.getString("name");
	   System.out.println(id1 +"-" + name1 );
	}
	}
	
	}
	
	
	



