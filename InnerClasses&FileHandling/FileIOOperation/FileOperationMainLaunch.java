package inFileIOOperation;

import java.io.File;
import java.io.IOException;

public class FileOperationMainLaunch {

	public static void main(String[] args) throws IOException {

		File f = new File("sr.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("srdir");
		f1.mkdir();
		
		File f3 = new File(f1,"wert.xlsx");
		f3.createNewFile();

		
		
		File f4 = new File("C:\\Users\\somesh.rout\\eclipse-workspace\\InnerClasses&FileHandling\\IPLdir");
	
		f4.mkdir();
		File f5 = new File(f4,"CSK.sql");
		f5.createNewFile();
		File f6 = new File("C:\\Users\\somesh.rout\\Desktop\\QUR");
		
		String[] s = f6.list();
		int count=0;
		for(String e:s)
		{
			count++;
		System.out.println(e);
		}
		System.out.println("No of files is: "+count);
	}

}
