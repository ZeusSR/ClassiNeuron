package in.JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.xdevapi.Statement;

public class databaseCOMMJDBCMain {

//	private static String 1;

	public static void main(String[] args) throws SQLException {

		//1.Loading & Registering Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//2.Setting-up connection
		String url = "jdbc:mysql://localhost:3306/sr";
		String user = "root";
		String password="12345";
		Connection connection = DriverManager.getConnection(url,user , password);
		
		//3.Creation of statement object(to move to the location using connection)
		Statement statement = connection.createStatement();
		
		//4.Using statement object to execute the query & store in resultset obj.
        String script ="Select id,name from students";
		ResultSet resultset = statement.executeQuery(script);
		
		//5.process the result to get the data
		System.out.println("sid\tsname");
		while(resultset.next())
		{
			Integer sid = resultset.getInt(1); 
			String sname = resultset.getString(2);
			System.out.println(sid+ "\t" +sname);
		}
		
		//6.Closing the resources used
		resultset.close();
		statement.close();
		connection.close();
	}

}
