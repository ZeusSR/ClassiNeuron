package in.dateOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class fetchMainLaunch {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter your Name to know your details: ");
		String vch_name = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String sqlquery = "Select id,vch_email,vch_firstname,vch_lasttname,dt_date FROM tem_employees WHERE vch_firstname=?";
		
		try
		{
			connection = JDBCConnection.getJDBCConnection();
			
			if(connection != null)
			{
				ps = connection.prepareStatement(sqlquery);
				
				if(ps != null)
				{
					ps.setString(1, vch_name);
					rs = ps.executeQuery();
					
					if(rs != null)
					{
						 if(rs.next())
			               {
						
					    int id = rs.getInt(1);
						String smail = rs.getString(2);
						String sfname = rs.getString(3);
						String slname = rs.getString(4);
						String sdate = sdf.format(rs.getDate(5)); 
						
						System.out.println("ID\tEMAIL\t\tFNAME\tLNAME\tDT");
						System.out.println(id+"\t"+smail+"\t"+sfname+"\t"+slname+"\t"+sdate);
					
			               }
						 else
						 {
							 System.out.println("Record not found");
						 }
					}	 
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
				JDBCConnection.closeConnection(rs, ps, connection, sc);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
