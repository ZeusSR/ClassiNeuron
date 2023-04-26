package in.FailFast_Safe;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class LaunchFSFS {

	public static void main(String[] args) {

		
		ArrayList aa = new ArrayList();
		
		aa.add(35);
		aa.add(34);
		aa.add("winner");
		aa.add("West");
		aa.add(1221);
		
//		//Fail Safe
//		for(int i=0;i<aa.size();i++)
//		{
//			System.out.println(aa.get(i));
//			aa.add(12+i*i*i);
//			
//			
//		}
		//Fail Fast
	/*	
	 * int i = 0;
	 * Iterator a = aa.iterator();
		
		while(a.hasNext())
		{
			
			System.out.println(a.next());
			aa.add(12+i*i*i);
		}
		*/
	
	
	//Fail Safe with Iterator
	
	CopyOnWriteArrayList co = new CopyOnWriteArrayList();
	
	co.add(12);
	co.add(21);
	co.add("212333");
	co.add("shark");
	
	Iterator ci = co.iterator();
	
	while(ci.hasNext())
	{
		System.out.println(ci.next());
		
		co.add("west");
	}
	

}
}