package in.Iterator;

import java.util.Iterator;
import java.util.*;

public class MainLauch1_class {

	public static void main(String[] args)  {
		
		LinkedList ll  = new LinkedList();
		
		ll.add(12);
		ll.add(32);
		ll.add(43);
		ll.add("Servlet");
		ll.add("RRR");
		
		System.out.println(ll);
		
		Iterator itr = ll.iterator();
//		
//		while(itr.hasNext())
//		{
//			
//			LinkedList qw= (LinkedList) itr.next(); //Downcasting being used
//			
//			
//		}
//		
		LinkedList ll1  = new LinkedList();
		
		ll1.add(21);
		ll1.add("box");
		ll1.add("saphire");
		ll1.add(33);
		
		ListIterator litr = ll1.listIterator(ll1.size());
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
		

	}

}
