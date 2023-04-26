/* It can store heterogeneous data*/

package in.ArrayList.Collections;

import java.util.ArrayList;

public class Launch_MainClass {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		ArrayList all = new ArrayList();
		
		al.add(10);
		al.add(10.234);
		al.add("Alpha");
		al.add(-12);
		al.add('Q');
		
		
		System.out.println(al);
		
		all.add("Zeus");
		all.add(12);
		all.add(23);
		
		System.out.println(all);
		
		al.add(all);
		System.out.println(al);
		
		al.addAll(all);
		System.out.println(al);

		System.out.println(al.contains("zeus"));
		System.out.println(al.get(5));
		
		boolean b = al.isEmpty();
		System.out.println(b);
		
		System.out.println(al.size());
		
	}

}
