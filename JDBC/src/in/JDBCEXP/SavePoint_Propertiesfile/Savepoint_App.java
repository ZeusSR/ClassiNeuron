package in.SavePoint_Propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlSavepoint;

public class Savepoint_App {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps[] = new PreparedStatement[3];
        
		
		try 
		{
		
			File f = new File("key.properties");
		    FileInputStream fis;
		
			fis = new FileInputStream(f);
			Properties props = new Properties();
			props.load(fis);
				
		
		
		
		MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
		
		dataSource.setURL(props.getProperty("url"));
		dataSource.setUser(props.getProperty("user"));
		dataSource.setPassword(props.getProperty("password"));
		
		
		//connection object is autocommit in nature so we have to make it as false.
		
		
		  connection = dataSource.getConnection();
		  connection.setAutoCommit(false);
		  
		  if(connection != null)
		  {
			  ps[0] = connection.prepareStatement("UPDATE tem_employees SET vch_lasttname ='sun'  WHERE id =3 ");
			  ps[1] = connection.prepareStatement("UPDATE tem_employees SET vch_lasttname ='wan'  WHERE id =4 ");
			  ps[2] = connection.prepareStatement("UPDATE tem_employees SET vch_lasttname ='bezos'  WHERE id =1 ");
			  
			  ps[0].executeUpdate();
			  ps[1].executeUpdate();
			  Savepoint sp = connection.setSavepoint();
			  ps[2].executeUpdate();
			  System.out.println("Not permitted");
			  
			  connection.rollback(sp);
			  
			  System.out.println("Rollbacked");
			  
			  connection.commit();
			  
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
			int i = 0;
			  if(connection != null)
			  {
			
					connection.close();
				
			  }
			  while(i <=2)
			  {
				  ps[i].close();
				  i++;
			  }
			}
			 catch (SQLException e) 
			 {
					e.printStackTrace();
			 }
			 
		}
		
	}

}
