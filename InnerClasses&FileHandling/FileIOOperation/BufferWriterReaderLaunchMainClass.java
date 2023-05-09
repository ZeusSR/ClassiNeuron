package in.FileIOOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferWriterReaderLaunchMainClass {

	public static void main(String[] args) throws IOException {

		BufferedWriter br = new BufferedWriter(new FileWriter("info.txt"));
		br.write(65);
		br.write("  is the ascii value of A");
		br.write(21);
		br.newLine();
		br.write("got it?");
		
		br.flush();
		br.close();
		
		FileReader fr = new FileReader("info.txt");
		FileReader fr1 = new FileReader("qwerty.txt");
		BufferedReader bre = new BufferedReader(fr);
		BufferedReader bre1 = new BufferedReader(fr1);
		
//		char[] ch = new char[(int) new File("info.txt").length()];
//		fr.read(ch);
//		for(char c:ch)
//		{
//			System.out.print(c);
//			
//		}
		

		PrintWriter pw = new PrintWriter("qwerty.txt");
		pw.print(1233);;
		pw.flush();
		pw.close();
		
		
        String s =bre.readLine();
		while(s != null)
		{
			System.out.println(s);
			s = bre.readLine();
		}
		
		  String s1 =bre1.readLine();
			while(s1 != null)
			{
				System.out.println(s1);
				s1 = bre1.readLine();
			}
		
		
	}

}
