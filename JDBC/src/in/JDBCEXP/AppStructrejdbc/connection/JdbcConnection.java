package in.AppStructrejdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	private JdbcConnection()
	{
		
	}
	
	public static Connection getJdbcConnection()
	{

		Connection connection = null;	
		String url = "jdbc:mysql://localhost:3306/sr";
		String user = "root";
		String password="12345";
		
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
	
	public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection)
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

	}

}
