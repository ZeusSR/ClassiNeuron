package in.ConnectionPoolEXP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class ConnectionPool_ConnectionJDBC {
	
	public static void main(String args[]) {
	
		//Creating a pooled connection object
	MysqlConnectionPoolDataSource datasource = new MysqlConnectionPoolDataSource(); 
	datasource.setUrl("jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false");
	datasource.setUser("krushandevu1");
	datasource.setPassword("Krush@k$0987");
	
	

	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the name to fetch details :");
	String sname = sc.next();
	
	
	String sqlscript = "SELECT id, vch_email,vch_firstname, vch_lasttname,dt_date,txt_status FROM tem_employees WHERE vch_firstname=?";
	
	
	
	try {
		
		 connection = datasource.getConnection();
	    
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
						int id = rs.getInt(1);
						String smail = rs.getString(2);
						String fname = rs.getString(3);
						String lname = rs.getString(4);
						
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						
						Date dtdate = rs.getDate(5);
						 String utdate = sdf.format(dtdate);
						
						File f = new File("temp_downloded_now.txt");
						FileWriter fr = new FileWriter(f); 
						Reader reader = rs.getCharacterStream(6);
						
						IOUtils.copy(reader, fr);
						fr.flush();
						
						System.out.println("The details are :\n "+id+"\t"+smail+"\t"+fname+"\t"+lname+"\t"+utdate);
						System.out.println("Downloaded File is in  :"+f.getAbsolutePath());
					}
				}
			}
		}
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	} catch(Exception e)
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
		 if(rs != null)
		 {
		 	try {
				rs.close();
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
