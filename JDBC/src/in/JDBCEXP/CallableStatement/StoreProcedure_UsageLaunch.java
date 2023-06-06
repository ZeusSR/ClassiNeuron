package in.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.CallableStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import in.CLOBOperation.Util.JDBCCONNECTION_MAIN;

public class StoreProcedure_UsageLaunch {

	public static void main(String[] args) {

		
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		dataSource.setUrl("jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false");
		dataSource.setUser("krushandevu1");
		dataSource.setPassword("Krush@k$0987");
		
		Connection connection = null;
		CallableStatement cs = null;
	    Scanner sc = new Scanner(System.in);
		ResultSet rs = null;
		String StoreProcedure = "{call getTemp_Employee(?,?,?,?)}";
		
		
		System.out.println("Enter the id you want to get details of  :");
		int id = sc.nextInt();
		
		try
		{
			connection = dataSource.getConnection();
			
			if(connection != null)
			{
				cs = connection.prepareCall(StoreProcedure);
			}
			if(cs != null)
			{
				cs.setInt(1, id);
				
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.VARCHAR);
				cs.registerOutParameter(4, Types.VARCHAR);
				
				cs.execute();
				
				System.out.println("Mail\tFName\tLName");
				System.out.println(cs.getString(2)+"\t"+cs.getString(3)+"\t"+cs.getString(4));
				
			}
		}
		 catch (SQLException e) 
		{
				e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{

			try
			{
			if(connection != null)
			{
					
				connection.close();
					
			}
			if(cs !=null)
			{
				cs.close();
			}
			if(sc != null)
			{
				sc.close();
			}
			if(rs != null)
			{
				rs.close();
			}
			
			}	
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(cs);
			
		}
  	
	}
}
