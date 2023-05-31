package in.dateOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCConnection {

	private JDBCConnection()
	{
		
	}
	
	public static Connection getJDBCConnection()
	{
		Connection connection = null;
		String url = "jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false";
		String user = "krushandevu1";
		String password = "Krush@k$0987";

		
		
		try
		{
			connection = DriverManager.getConnection(url,user , password);
			
			if(connection != null)
			{
				return connection;
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}	
	
	public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection,Scanner sc)
			throws SQLException {

		// 6. closing the resources used
		if (resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();

		}
		if (connection != null) {
			connection.close();
		}

		if (sc != null) {
			sc.close();
		}
	}
	
	
}
