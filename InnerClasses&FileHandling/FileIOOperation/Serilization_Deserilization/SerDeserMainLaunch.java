package Serilization_Deserilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class utrakhand implements Serializable
{
	 transient String place1 ="Kedarnath";
	 String place2 ="Sonprayag";
	 Integer cost = 30000;
}

class ujjain implements Serializable
{
	 String place2 ="Mahakal";
	Integer cost = 10000;
	
}


public class SerDeserMainLaunch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		utrakhand u = new utrakhand();
		ujjain uj = new ujjain();
		
//		Serilization

		FileOutputStream f = new FileOutputStream("seri_desi_exp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f); 
		oos.writeObject(u);	
		oos.writeObject(uj);	
		
//		Deserilization
		FileInputStream fr = new FileInputStream("seri_desi_exp.ser");
		ObjectInputStream oor = new ObjectInputStream(fr); 
		Object a = oor.readObject();
		utrakhand u1 = (utrakhand)a;
		ujjain b =(ujjain)oor.readObject();;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(u1.place1+"\n"+u1.place2+"\n"+u1.cost+"\n");
		System.out.println(b.place2+"\n"+b.cost);
		
	}

}
