package in.neuralnet.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {

	private JdbcUtil() {
		
	}
	static
	{
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() throws SQLException, IOException
	{
//		String dbloc = "C:\\Users\\somesh.rout\\eclipse-workspace_web\\JDBCMVC_APP\\src\\main\\java\\in\\neuralnet\\properties\\db.properties";
//		FileInputStream fis = new FileInputStream(dbloc);
//		Properties props = new Properties();
//		props.load(fis);
//		
//		String user = props.getProperty("user");
//		String password = props.getProperty("password");
//		String url = props.getProperty("url");
		
//		String url = "jdbc:postgresql://us-east-1.495b80b7-3ad7-4276-a099-6610e1207a83.aws.ybdb.io:5433/postgres?ssl=true&sslmode=verify-full&sslrootcert=C:/Users/somesh.rout/eclipse-workspace_web/JDBCMVC_APP/root.crt";
//		String user = "admin";
//		String password = "5ioBHWAT94zYWx-WiiCBd5bx9FK1L6";
		
		String url = "jdbc:postgresql://localhost:5433/in_db_instance?&ssl=false";
		String user = "postgres";
		String password = "Csm#5518";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		return connection;
	}

	
}
