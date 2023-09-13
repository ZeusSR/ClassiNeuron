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
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getJdbcConnection() throws SQLException, IOException
	{
		String dbloc = "C:\\Users\\somesh.rout\\eclipse-workspace_web\\JDBCMVC_APP\\src\\main\\java\\in\\neuralnet\\properties\\db.properties";
		FileInputStream fis = new FileInputStream(dbloc);
		Properties props = new Properties();
		props.load(fis);
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String url = props.getProperty("url");
		

		Connection connection = DriverManager.getConnection(url,user,password);
		
		return connection;
	}

	
}
