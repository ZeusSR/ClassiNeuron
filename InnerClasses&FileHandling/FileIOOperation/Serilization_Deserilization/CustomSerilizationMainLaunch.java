package Serilization_Deserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String ID = "REST1221";
	transient String Password = "Smile_Peace@9867";
	String epin = "qwerty"; 
	private  void writeObject(ObjectOutputStream oo) throws Exception
	{
		oo.defaultWriteObject();//performing default Serialization
		String epwd="1232"+Password;//performing encryption
		oo.writeObject(epwd);

	}
	
	private  void readObject(ObjectInputStream oi) throws Exception
	{
		oi.defaultReadObject();//performing default Serialization
		String epwd=(String)oi.readObject();//performing decryption
        Password = epwd.substring(2, (epwd.length()-4)).concat(epwd.substring(1, epwd.length()-7).formatted(epin));
	}
}


public class CustomSerilizationMainLaunch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Account acc = new Account();
		
		FileOutputStream fo = new FileOutputStream("seri_desi_exp_custom.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		oo.writeObject(acc);

		FileInputStream fi = new FileInputStream("seri_desi_exp_custom.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Account aca = (Account)oi.readObject();
		System.out.println(aca.ID+"\n"+aca.Password);

		
		
	}

}
