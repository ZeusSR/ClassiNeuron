package in.dateOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class insertClass {

	public static void main(String[] args) throws ParseException
	{
		
	
	Connection connection = null;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);
	
	String insertquery = "Insert into tem_employees (vch_email,vch_firstname,vch_lasttname,dt_date) VALUES(?,?,?,?)";
	
	System.out.println("Enter your Email :");
	String vch_mail = sc.next();
	
	
	System.out.println("Enter your First Name");
	String fname = sc.next();
	
	System.out.println("Enter your Last Name :");
	String lname = sc.next();
	
	System.out.println("Enter your DOB (dd-mm-yyy):");
	String dDate = sc.next();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	java.util.Date a =  sdf.parse(dDate);
	
	long time = a.getTime();
	
	java.sql.Date sqldate =  new java.sql.Date(time);
	
	try
	{
		connection = JDBCConnection.getJDBCConnection();
		
		if(connection != null)
		{
			ps = connection.prepareStatement(insertquery);
			
			if(ps != null)
			{
			   ps.setString(1, vch_mail);
			   ps.setString(2, fname);
			   ps.setString(3, lname);
			   ps.setDate(4, sqldate);
			   
			   int ro =ps.executeUpdate();
			   
			   System.out.println("No. of rows affected :"+ro);
			}	
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
			JDBCConnection.closeConnection(null, ps, connection, sc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	}

}
