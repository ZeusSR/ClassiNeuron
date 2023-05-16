package Serilization_Deserilization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Storm implements Externalizable
{
	String s;
	Integer i;
	Integer j;
	
	
	
	
	public Storm() {
		super();
	}

	public Storm(String s, Integer i, Integer j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		 out.writeObject(s);
		 out.writeObject(j);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		s = (String) in.readObject();
		j = (Integer) in.readObject();
	}
	
	
}

public class externalisationMainLaunch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Storm st = new Storm("Thunder", 78, 93);
		
		FileOutputStream fo = new FileOutputStream("qasdfe.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);

		oo.writeObject(st);
		
		FileInputStream fi = new FileInputStream("qasdfe.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Storm ser = (Storm) oi.readObject();
		
		System.out.println(ser.s+"\n"+ser.i+"\n"+ser.j);
		
		
	}

	
}
