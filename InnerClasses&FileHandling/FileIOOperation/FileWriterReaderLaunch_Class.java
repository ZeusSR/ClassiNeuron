package in.FileIOOperation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderLaunch_Class {

	public static void main(String[] args) throws IOException {


		File f = new File("E:\\JAVA\\Basics\\InnerClass&FileHandling\\IPLDir\\CSK.txt");
		char[] a= {'C','S','K'};
		
		FileWriter fw = new FileWriter(f);
		fw.write(a);
		fw.write("\n MS Dhoni");
		fw.write("\n Deshpande");
		fw.write("\n Conway");
		
		fw.flush();
		fw.close();
		
		
//		FileReader fr = new FileReader(f);
//		fr.read();
//		System.out.println(fr);
		
	}

}
