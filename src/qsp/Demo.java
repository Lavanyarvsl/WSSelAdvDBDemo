package qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//13-01-2018
//Example 1 connecting to mysql db
public class Demo {

	public static void main(String[] args) throws SQLException {
		
		
		String connectionString="jdbc:mysql://localhost:3306/qspiders";
		String un="root";
		String pw="root";
		
		Connection conObj =DriverManager.getConnection(connectionString,un,pw);
		conObj.close();
		System.out.println("Done");

	}

}
