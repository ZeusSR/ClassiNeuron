package in.SavePoint_Propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class LaunchPropertiesfile_App {

	public static void main(String[] args)  {

		Connection connection = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		
		try 
		{
		
			File f = new File("key.properties");
		    FileInputStream fis;
		
			fis = new FileInputStream(f);
			Properties props = new Properties();
			props.load(fis);
				
		
//		String url = props.getProperty("url");
//		String user = props.getProperty("user");
//		String password = props.getProperty("password");
		
		
		
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		
		dataSource.setURL(props.getProperty("url"));
		dataSource.setUser(props.getProperty("user"));
		dataSource.setPassword(props.getProperty("password"));
		
		System.out.println("Enter the  the last name you wanna update :");
		String lname = sc.next();

		System.out.println("Enter the id you want to update the last name :");
		int id = sc.nextInt();
		
		  connection = dataSource.getConnection();
		  
		  if(connection != null)
		  {
			  ps = connection.prepareStatement("UPDATE tem_employees SET vch_lasttname = ? WHERE id = ?");
			  
			  if(ps != null)
			  {
				  ps.setString(1, lname);
				  ps.setInt(2, id);
				  boolean var = ps.execute();
				  if(var == false)
				  {
					  System.out.println("Successfully updated");
					  
				  }
				  else if(var == true)
				  {
					  System.out.println("Something went wrong");
				  }
			  }
		  }
		
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
     	catch (Exception e) 
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
			  if(ps != null)
			  {
				  ps.close();
			  }
			  if(sc!= null)
			  {
				  sc.close();
			  }
			}
			 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		
	}

}
