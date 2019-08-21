
import java.sql.SQLException;

import jdbc.EmployeeDao;

public class TestInsert {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao.insert(103,"Naresh");
		EmployeeDao.insert(102,"Sheyne");
		
		
	}

}
