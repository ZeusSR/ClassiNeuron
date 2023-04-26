package in.ArrayDeque.Collections;

import java.util.ArrayDeque;

public class LaunchMain_Class {

	public static void main(String[] args) {

		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(12);
		ad.add(22);
		ad.add("Zeus");
		ad.add("Vraha");
		
		
		System.out.println(ad);
		
		ad.addFirst(123);
		ad.addLast(345);
		
		System.out.println(ad);

		ad.remove(12);
		System.out.println(ad);
				
	}

}
