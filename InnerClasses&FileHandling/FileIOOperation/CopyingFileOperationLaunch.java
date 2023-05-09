package in.FileIOOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyingFileOperationLaunch {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("combo.txt");
		BufferedReader brq = new BufferedReader(new FileReader("csk.txt"));
		BufferedReader breq = new BufferedReader(new FileReader("info.txt"));
	
	
//        String s =brq.readLine();
//		while(s != null)
//		{
//			  pw.println(s);
//			s = brq.readLine();
//		}
//		
//		  String s1 =breq.readLine();
//			while(s1 != null)
//			{
//			    pw.println(s1);
//				s1 = breq.readLine();
//			}
		
        String s =brq.readLine();
        String s1 =breq.readLine();
		while(s != null ||s1!=null)
		{
			  pw.println(s);
			s = brq.readLine();
			pw.println(s1);
			s1 =breq.readLine();
		}
		
		  
			
			brq.close();
			breq.close();			
		    pw.flush();
			pw.close();
		
	}

}
