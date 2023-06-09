package in.SavePoint_Propertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSet_App {

	public static void main(String[] args) throws SQLException, IOException {

		RowSetFactory factory = RowSetProvider.newFactory();
		JdbcRowSet rowset = factory.createJdbcRowSet();
		
		File f = new File("key.properties");
	    FileInputStream fis;
	
		fis = new FileInputStream(f);
		Properties props = new Properties();
		props.load(fis);
		
		rowset.setUrl(props.getProperty("url"));
		rowset.setUsername(props.getProperty("user"));
		rowset.setPassword(props.getProperty("password"));
		
		
		rowset.setCommand("Select id,vch_email,vch_firstname,vch_lasttname from tem_employees");
		rowset.execute();
		
		System.out.println("ID\tMAIL\tFNAME\tLNAME");
		
		while(rowset.next())
		{
			System.out.println(rowset.getInt(1)+"\t"+rowset.getString(2)+"\t"+rowset.getString(3)+"\t"+rowset.getString(4));
		}
		
		System.out.println();
		
		System.out.println("Reverse");
		System.out.println("\nID\tMAIL\tFNAME\tLNAME");
		while(rowset.previous())
		{
			System.out.println(rowset.getInt(1)+"\t"+rowset.getString(2)+"\t"+rowset.getString(3)+"\t"+rowset.getString(4));
		}
		
		
		rowset.moveToInsertRow();
		
		rowset.updateString(2, "xoxox@yale.com");
		rowset.updateString(3, "Paul");
		rowset.updateString(4, "John");

		
		rowset.insertRow();
		

	}

}
