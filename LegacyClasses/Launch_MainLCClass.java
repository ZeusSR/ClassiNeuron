package in.LegacyClasses;

import java.util.Enumeration;
import java.util.Vector;

public class Launch_MainLCClass {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add(100);
		v.add(101);
		v.add("LionHeart");
		v.add(99);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
