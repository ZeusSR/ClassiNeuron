package Serilization_Deserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class supreme implements Serializable
{
	high h = new high();
}

class high implements Serializable
{
	process p = new process();
	
}
class process implements Serializable
{
	String sm = "Object graph Example";
	
	public String commute()
	{
		return sm;
	}
}

public class ObjectGraphLaunch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		supreme s = new supreme();
		
		FileOutputStream f = new FileOutputStream("seri_desi_exp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f); 
		oos.writeObject(s);	
		
//		Deserilization
		FileInputStream fr = new FileInputStream("seri_desi_exp.ser");
		ObjectInputStream oor = new ObjectInputStream(fr); 
		supreme a = (supreme)oor.readObject();
		
		System.out.println(a.h.p.commute());

	}

}
