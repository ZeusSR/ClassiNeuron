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
//}
//class Model extends Repository
//{
////	int k;
//	int i= 23;
//	int j=34;
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
//	int k;
	int i= 23;
	int j=34;
	public Model() {
		super();
		
		System.out.println("Model constructor calling");
	}
	
	
}

public class inhertanceSerilizationDeserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Model m = new Model();
		
		FileOutputStream fo = new FileOutputStream("werto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(m);
		
		
		FileInputStream fis = new FileInputStream("werto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Model m1 = (Model)ois.readObject();
		System.out.println(m1.i+"===========>"+m1.j+" ,\n"+m1.k);
		

	}

}
