package in.Generics;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	String name;
	Integer age;
	String qrnumber;
	
	
	

	public Student(String name, Integer age, String qrnumber) {
		super();
		this.name = name;
		this.age = age;
		this.qrnumber = qrnumber;
	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", qrnumber=" + qrnumber + "]";
	}




	@Override
	public int compareTo(Student o) {
		
		return this.age -o.age;
	}
	
}


public class ComparableMainClass {

	
	public static void main(String[] args) {

		
		ArrayList<Student> a = new ArrayList<>();
		
		a.add(new Student("Ram",54,"PR12345test"));
		a.add(new Student("Shyam",91,"qwert5432"));
		a.add(new Student("Gopal",13,"qazxcvb12344"));
		a.add(new Student("Shiva",22,"mlpoijn0887"));
		
		System.out.println(a);
		
		Collections.sort(a);
		
		System.out.println(a);
		
	}

}
