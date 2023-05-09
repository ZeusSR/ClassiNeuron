package inFileIOOperation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderLaunch_Class {

	public static void main(String[] args) throws IOException {


//		File f = new File("C:\\Users\\somesh.rout\\eclipse-workspace\\InnerClasses&FileHandling\\IPLdir\\csk.txt");
//		char[] a= {'C','S','K'};
//		
//		FileWriter fw = new FileWriter(f);
//		fw.write(a);
//		fw.write("\n MS Dhoni");
//		fw.write("\n Deshpande");
//		fw.write("\n Conway");
//		
//		fw.flush();
//		fw.close();
		
		File f = new File("C:\\Users\\somesh.rout\\eclipse-workspace\\InnerClasses&FileHandling\\IPLdir\\csk.txt");
		FileReader fr = new FileReader("C:\\Users\\somesh.rout\\eclipse-workspace\\InnerClasses&FileHandling\\IPLdir\\csk.txt");
//		int i=fr.read();
//
//		while(i!=-1)
//		{	
//			
//		System.out.println((char)i);
//		 i=fr.read();
//		}
		
		char[] c = new char[(int) f.length()];
		
		fr.read(c);
		
		for(char ch:c)
		{	System.out.print(ch);
		}
		
		fr.close();
	}

}
