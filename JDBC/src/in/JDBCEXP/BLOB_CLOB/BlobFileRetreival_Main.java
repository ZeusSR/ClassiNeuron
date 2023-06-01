package in.BLOB_CLOB;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import in.JDBCUtil.connection.JdbcConnection;

public class BlobFileRetreival_Main {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name you want to download photo of:");
		String sname = sc.next();
		
		String sqlscript = "Select name,blob_img from students WHERE name = ?";
		
		try 
		{
			connection = JdbcConnection.getJdbcConnection();
			
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
								 String name = rs.getString(1);
								 InputStream photo = rs.getBinaryStream(2);
//								 int i = photo.read();
								 
                                 File f = new File("somesh_downloaded.jpg");
								 FileOutputStream fos = new FileOutputStream(f);
								 
/*								 while(i!=-1)
								 {
									 fos.write(i);
									 i=photo.read();
								 }
								 
	*/
							/*	byte[] buffer = new byte[2033];
								
								while(photo.read(buffer)>0)
								{
									fos.write(buffer);
								}
								*/
								//With External Jar 
								 IOUtils.copy(photo, fos);
								 
								 System.out.println("The downloaded photo of Master "+name+" is in location :"+f.getAbsolutePath());
							 }
						 }
					}

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
			try {
				if(sc!=null)
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
