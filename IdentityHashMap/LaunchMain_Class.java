package IdentityHashMap;

import java.util.IdentityHashMap;

class temp
{

	@Override
	public String toString() {
	
		return "tempNow";
	}

	
	
}

public class LaunchMain_Class {

	public static void main(String[] args) {

		IdentityHashMap h = new IdentityHashMap();
		
		temp t = new temp();
		
		Integer i1 = new Integer(7);
		Integer i2 = new Integer(7);
		
		
		h.put(i1, "Ronaldo");
		h.put(i2, "Dhoni");
		h.put(i1, "Messi");
		h.put(t, "Rox");
		System.out.println(h);
		System.out.println(t);
	}

}
