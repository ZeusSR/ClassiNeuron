package in.FileIOOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class fileOperationexistLaunchMain {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("writefile.txt");
		
		
		BufferedReader b1= new BufferedReader(new FileReader("file1.txt"));
		BufferedReader b2=null;
		
		String s1 = b1.readLine();
		
		
		while (s1 != null)
		{
			b2= new BufferedReader(new FileReader("file2.txt"));
			Boolean isavailaibe = false;
			String s2 = b2.readLine();
			while(s2 != null)
			{
				if(s1.equals(s2))
				{
					isavailaibe= true;
					break;
				}
				s2 = b2.readLine();
			}
				 if(isavailaibe == false)
				{
					pw.println(s1);
					pw.flush();
				}
				 s1 = b1.readLine();
			
		}
		
		pw.close();
		b1.close();
		b2.close();
	}

}
