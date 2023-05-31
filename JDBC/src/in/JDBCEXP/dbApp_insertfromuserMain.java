package in.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class dbApp_insertfromuserMain {

	public static void main(String[] args) throws SQLException {

		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;

		
		String url = "jdbc:mysql://192.168.10.84:3306/dss_production?useSSL=false";
		String user = "krushandevu1";
		String password = "Krush@k$0987";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your email:");
		String vch_email = sc.next();
		
		System.out.println("Enter your First name:");
		String vch_firstname = sc.next();
		
		System.out.println("Enter your Last name:");
		String vch_lasttname = sc.next();

		try
		{
			connection = DriverManager.getConnection(url, user, password);
			 
			 if(connection !=null)
			 {	

			   statement = connection.createStatement();
			
			     if(statement != null)
			     {
//				       String insertquery ="insert into tem_employees(vch_email,vch_firstname,vch_lasttname) values("+"'"+vch_email+"'"+","+"'"+vch_firstname+"'"+","+"'"+vch_lasttname+"'"+")" ;

			    	 String insertquery = String.format("insert into tem_employees(vch_email,vch_firstname,vch_lasttname) values('%s','%s','%s')",vch_email,vch_firstname,vch_lasttname);		    	 
				       int noofrows = statement.executeUpdate(insertquery);
				       
				       System.out.println(noofrows+": No. of Rows affected");
			     }
			 }
		}
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
			 if(statement !=null)
			 {
				 statement.close();
			 }
             if(connection !=null)
             {
            	 connection.close();
             }
		}
		
		
		
	}

}
