

import java.sql.SQLException;

import jdbc.EmployeeDao;

public class TestDelete {
	
	

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		EmployeeDao.delete(103);
		
		
	}

}
