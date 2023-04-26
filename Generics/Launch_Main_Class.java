package in.Generics;

import java.util.ArrayList;

public class Launch_Main_Class {

	public static void main(String[] args) {

//		ArrayList al = new ArrayList();
//		
//		al.add("Sachin");
//		al.add("Suresh");
//		al.add(11);
//		
//		
//		String s1 = (String) al.get(0);
//		String s2 = (String) al.get(1);
//		String s3 = (String) al.get(2); //Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		//at in.Generics.Launch_Main_Class.main(Launch_Main_Class.java:18)
//		
//		System.out.println(s1+" "+s2+""+s3);
		
		ArrayList <String>al1 = new ArrayList<String>();  // Here by adding <String> we male the collection class Type-Safe
		
		al1.add("Sachin");
		al1.add("Suresh");
//		al1.add(11); //As the collection class is made Typesafe it will not accept Integer data in the collection. 
		
		
		String s1 =  al1.get(0);
		String s2 =  al1.get(1);
//		String s3 = (String) al1.get(2);
		
		System.out.println(s1+" "+s2);
	}

}
