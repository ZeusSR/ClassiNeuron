package in.HashSet.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class mainLauch_Class {

	public static void main(String[] args) {

		
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add(212);
		hs.add(22);
		hs.add(98);
		
		
		System.out.println(hs);
		
        LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(212);
		lhs.add(22);
		lhs.add(98);
		
		System.out.println(lhs);
		
	}

}
