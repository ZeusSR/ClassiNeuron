package in.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// class compareImpl implements Comparator<Mass>
//{
////	@Override
////	public int compare(Mass o1, Mass o2) {
////
////		return o1.age - o2.age;
////	}
////	
//}

class Mass 
{
	String name;
	Integer age;
	String qrnumber;
	
	
	
	
	public Mass(String name, Integer age, String qrnumber) {
		super();
		this.name = name;
		this.age = age;
		this.qrnumber = qrnumber;
	}




	@Override
	public String toString() {
		return "Mass [name=" + name + ", age=" + age + ", qrnumber=" + qrnumber + "]";
	}

	

}
public class ComparatorMainClass {

	public static void main(String[] args) {
       
		ArrayList<Mass> a = new ArrayList<>();
		
		List<Integer> aum = Arrays.asList(9,8,3,45,44);
		
		a.add(new Mass("Rameshwar",54,"PR12345test"));
		a.add(new Mass("Shyamnath",91,"qwert5432"));
		a.add(new Mass("Gopalnath",13,"qazxcvb12344"));
		a.add(new Mass("Shivoham",22,"mlpoijn0887"));
		
		Comparator<Mass> p = (Mass o1,Mass o2) ->  o1.age - o2.age;

		
		System.out.println(a);
		System.out.println(aum);
		
		Collections.sort(a,p);
		Collections.sort(aum, (q,w)->w-q);
		
		System.out.println(a);
		System.out.println(aum);
		
	}

}
