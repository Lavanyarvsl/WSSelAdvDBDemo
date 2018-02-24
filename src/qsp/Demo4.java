package qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


//13-01-2018
//Example 3: execute sql in DB print all the data
public class Demo4 {

	public static void main(String[] args) throws SQLException {
		
		
		String connectionString="jdbc:mysql://localhost:3306/qspiders";
		String un="root";
		String pw="root";
		
		Connection conObj =DriverManager.getConnection(connectionString,un,pw);
		
		
		String sql="insert into emp values(5,'qsp','bng')";
		
		conObj.createStatement().executeUpdate(sql);
		
		conObj.close();
		System.out.println("Done");

	}

}
