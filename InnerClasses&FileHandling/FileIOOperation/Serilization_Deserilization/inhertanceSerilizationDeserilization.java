package Serilization_Deserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Repository implements Serializable
//{
//	int k=21;
//    public Repository() {
//	super();
//	
//	System.out.println("Repository constructor calling");
//}
//class Model extends Repository
//{
   
//int l=22;
//
//public Model() {
//	super();
//	
//	System.out.println("Model constructor calling");
//}


//}
class Repository 
{
	int k=21;

	public Repository() {
		super();
		
		System.out.println("Repository constructor calling");
	}
	
}
class Model extends Repository implements Serializable
{
	int l=22;

	public Model() {
		super();
		
		System.out.println("Model constructor calling");
	}
	
	
}

public class inhertanceSerilizationDeserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Model m = new Model();
		m.k= 89;
		m.l=76;
		
		FileOutputStream fo = new FileOutputStream("werto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(m);
		
		
		FileInputStream fis = new FileInputStream("werto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Model m1 = (Model)ois.readObject();
		System.out.println(m1.k+"===========>"+m1.l);
		

	}

}
