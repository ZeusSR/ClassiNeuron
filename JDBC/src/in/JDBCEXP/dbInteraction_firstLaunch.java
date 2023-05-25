package in.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class dbInteraction_firstLaunch {

	public static void main(String[] args) throws SQLException    {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;

		
		String url = "jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false";
		String user = "krushandevu1";
		String password = "Krush@k$0987";
		
		try
		{
		 connection = DriverManager.getConnection(url, user, password);
		 
		 if(connection !=null)
		 {	

		   statement = connection.createStatement();
		
		     if(statement != null)
		     {
		       String sqlstatement = "Select id,vch_email,vch_firstname,vch_lasttname from tem_employees";
		       resultset = statement.executeQuery(sqlstatement);
		         if(resultset != null)
		         {
		            System.out.println("ID\tVCH_EMAIL\tVCH_FIRSTNAME\tVCHLAST_NAME");
	
		                while(resultset.next())
		               {
			               Integer Id = resultset.getInt(1);
			               String vch_email = resultset.getString(2);
			               String vch_firstname = resultset.getString(3);
			               String vch_lasttname = resultset.getString(4);
			               System.out.println(Id + "\t " +vch_email + "\t" + vch_firstname + "\t\t" +vch_lasttname);
		           }
		         }           
		

		     }}}
    
 
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			 if(resultset !=null)
			 {
				 resultset.close();
			 }
			 if(statement !=null)
			 {
				 statement.close();
			 }
             if(connection !=null)
             {
            	 connection.close();
             }
		}
}}