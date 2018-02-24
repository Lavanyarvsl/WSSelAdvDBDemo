package qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


//13-01-2018
//Example 3: execute sql in DB print all the data
public class Demo3 {

	public static void main(String[] args) throws SQLException {
		
		
		String connectionString="jdbc:mysql://localhost:3306/qspiders";
		String un="root";
		String pw="root";
		
		Connection conObj =DriverManager.getConnection(connectionString,un,pw);
		
		
		String sql="select * from emp";
		ResultSet res=conObj.createStatement().executeQuery(sql);
		int cc=res.getMetaData().getColumnCount();
		
		
		while(res.next())
		{
			for(int i=1;i<=cc;i++)
			{
				String v=res.getString(i);
				System.out.println(v);
			}
			System.out.println("---------------");
		}
		
		
		
			
		
		
		conObj.close();
		System.out.println("Done");

	}

}
