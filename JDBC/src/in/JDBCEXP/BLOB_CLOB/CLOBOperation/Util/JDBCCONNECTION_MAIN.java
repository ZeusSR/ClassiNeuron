package in.CLOBOperation.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCONNECTION_MAIN {

	private JDBCCONNECTION_MAIN()
	{
		
	}

	
	public static Connection getJDBCConnection()
	{
		Connection connection = null;
		String url = "jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false";
		String user = "krushandevu1";
		String password = "Krush@k$0987";
		
		try {
			connection =  DriverManager.getConnection(url, user, password);
			
			if(connection != null)
			{
				return connection;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		return connection;
	}
	
	public static void closeConnections(Connection connection,PreparedStatement ps,ResultSet rs,Scanner sc)
	{
	 try
		{
			
		
		 if(connection != null)
		 {
			connection.close();
		 }
		
		 if(ps != null)
		 {
		 	ps.close();
			
		 }
		 if(rs != null)
		 {
		 	rs.close();
		 }
		if(sc != null)
		 {
		 	sc.close();
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
	 
	}
	
}
