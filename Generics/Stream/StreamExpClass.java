package in.Generics.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student
{
	String name;
	Integer age;
	String tech;
	
	public Student(String name, Integer age, String tech) {
		super();
		this.name = name;
		this.age = age;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tech=" + tech + "]";
	}
	
	
}

public class StreamExpClass {

	public static void main(String[] args) {

		List<Student>  al = Arrays.asList(new Student("Ram",29,"GO"),new Student("lanam",23,"Rust"),
				                          new Student("broom",33,"Rust"),new Student("Kedarnath",22,"JAVA"));
		
		System.out.println(al);
		
		al.stream().filter((n)->n.tech.equals("Rust")).forEach(n->System.out.println(n));
		
		Stream s1 = al.stream().filter((s)->s.age%2==0);
		s1.forEach(n->System.out.println(n));
		
	}

}
