package in.FileIOOperation;

import java.io.File;

public class FileIOLaunchClass {

	public static void main(String[] args) {

		
		File f = new File("E:\\JAVA\\Basics\\InnerClass&FileHandling");
		String[] s = f.list();
		
		int dircount=0;
		int filecount=0;
//		for(String e:s)
//		{
//			count++;
//			System.out.println(e);
//			
//		}
//		System.out.println("No of availaible files/dir is : "+count);
		
		for(String e:s)
		{
//			File f1 =new File(f,e);
			
     		if(new File(f,e).isFile())
     		{
     			filecount++;
     			System.out.println(e);
     		}
			else if(new File(f,e).isDirectory())
			{	
			dircount++;
			
			System.out.println(e);
			}
		}
		System.out.println("No of availaible files is : "+filecount+" & Directory count is: "+dircount);

		
		
	}

}
