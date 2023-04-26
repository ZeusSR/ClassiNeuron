package in.HashTable;

import java.util.Hashtable;

public class LaunchMain {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		
		ht.put(10, "Messi");
		ht.put(10, "Sachin");
//		ht.put(null, "Thanos");
//		ht.put("EY",null);
		ht.put(11, "Messi");
		System.out.println(ht);
	
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println(t1+" "+t2);
		
//		System.out.println(t1.toString()+"  "+t2.toString());
	}

}
class Test
{
//  int rollno;
//
//	public Test(int rollno) {
//	super();
//	this.rollno = rollno;
//     }
//
//	@Override
//	public int hashcode()
//	{
//		return rollno;		
//	}
}