package in.CLOBOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.CLOBOperation.Util.JDBCCONNECTION_MAIN;

public class ClOBINSERT_Main {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name for whom you want to update file :");
		String sname = sc.next();
		
				
		
		String sqlstatement = "UPDATE tem_employees SET txt_status=? WHERE vch_firstname = ?";
		
		try
		{
		File f = new File("temp.txt");
		FileReader fr = new FileReader(f);
		
		  connection = JDBCCONNECTION_MAIN.getJDBCConnection();
		  
		  if(connection !=null)
		  {
			  ps = connection.prepareStatement(sqlstatement);
			  
			  if(ps != null)
			  {
				  ps.setString(2, sname);
				  ps.setCharacterStream(1, fr);
				  
				 int ro = ps.executeUpdate();
				 if(ro >0)
				 {
					 System.out.println("No. of rows affected is/are :"+ro);
				 }
				 else
				 {
					 System.out.println("Record not found");
				 }
			  }
		  }
		
		
		
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			JDBCCONNECTION_MAIN.closeConnections(connection, ps, null, sc);
		}
	}

}
