package in.AppStructrejdbc.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.AppStructrejdbc.connection.JdbcConnection;

public class OperatioJdbcMainLaunch {

	public static void main(String[] args) {

		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ID:");
		int int_id =sc.nextInt();
		
		System.out.println("Enter your name:");
		String vch_name = sc.next();
		
		String sqlquery = "Insert into students(id,name) values(?,?)";
		
		try
		{
			connection = JdbcConnection.getJdbcConnection();
		
			if(connection != null)
			{
				
				ps = connection.prepareStatement(sqlquery);
				ps.setInt(1, int_id);
				ps.setString(2, vch_name);
				int no = ps.executeUpdate();
				System.out.println("No. of rows affected: "+no);
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
		finally
		{
			try {
				if(sc != null)
				{
					sc.close();
				}
				
				JdbcConnection.closeConnection(rs, ps, connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
