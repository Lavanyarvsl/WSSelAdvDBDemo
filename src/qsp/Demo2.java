package qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//13-01-2018
//Example 2: execute sql in DB count columns & print it
public class Demo2 {

	public static void main(String[] args) throws SQLException {
		
		
		String connectionString="jdbc:mysql://localhost:3306/qspiders";
		String un="root";
		String pw="root";
		
		Connection conObj =DriverManager.getConnection(connectionString,un,pw);
		
		
		String sql="select * from emp";
		ResultSet res=conObj.createStatement().executeQuery(sql);
		int cc=res.getMetaData().getColumnCount();
		System.out.println(cc);
		
		for(int i=1;i<=cc;i++)
		{
			String cn=res.getMetaData().getColumnTypeName(i);
			
			System.out.println(cn);
		}
		
		conObj.close();
		System.out.println("Done");

	}

}
