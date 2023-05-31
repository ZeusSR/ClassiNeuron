package in.BLOB_CLOB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.AppStructrejdbc.connection.JdbcConnection;

public class BlobOperation_Main {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name you want to update photo:");
		String sname = sc.next();
		
		String sqlUP = "Update students Set blob_img=? WHERE name =?";
		
		try
		{
			connection = JdbcConnection.getJdbcConnection();
			File f = new File("somesh.jpg");
			FileInputStream fis = new FileInputStream(f);
			
			if(connection != null)
			{
				ps = connection.prepareStatement(sqlUP);
				
				if(ps != null)
				{
					ps.setBlob(1, fis);
					ps.setString(2, sname);
					int row = ps.executeUpdate();
					
					System.out.println("No. of rows affected :"+row);
				}
			}
			
		}
		catch(SQLException | FileNotFoundException se)
		{
			se.printStackTrace();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection != null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(ps != null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(sc != null)
			{
				sc.close();
			}

		}
	}

}
