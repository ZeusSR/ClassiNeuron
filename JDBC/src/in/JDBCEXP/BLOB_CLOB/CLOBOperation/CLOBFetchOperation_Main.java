package in.CLOBOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import in.CLOBOperation.Util.JDBCCONNECTION_MAIN;

public class CLOBFetchOperation_Main {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		
		String sqlscript = "Select txt_status from tem_employees WHERE vch_firstname = ?";
		
		System.out.println("Enter name whose files you want to download :");
		String sname = sc.next();
		
		try
		{
			connection = JDBCCONNECTION_MAIN.getJDBCConnection();
			
			if(connection != null)
			{
				ps = connection.prepareStatement(sqlscript);
				
				if(ps != null)
				{
					ps.setString(1, sname);
					rs = ps.executeQuery();
					
					if(rs != null)
					{
						if(rs.next())
						{
							File f = new File("temp_downloded.txt");
							FileWriter fr = new FileWriter(f); 
							Reader reader = rs.getCharacterStream(1);
							
							IOUtils.copy(reader, fr);
							fr.flush();
							
							System.out.println("Downloaded File is in  :"+f.getAbsolutePath());
							
							
						}
					}
				}
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{

			JDBCCONNECTION_MAIN.closeConnections(connection, ps, rs, sc);
		}
	}

}
