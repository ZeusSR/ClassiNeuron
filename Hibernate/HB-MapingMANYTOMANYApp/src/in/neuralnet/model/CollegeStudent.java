package in.neuralnet.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class CollegeStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String address;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<CourseStudent> courseStudents;

	public CollegeStudent(String sname, String address, Set<CourseStudent> courseStudents) {
		this.sname = sname;
		this.address = address;
		this.courseStudents = courseStudents;
	}

	public CollegeStudent() {
		System.out.println("used by hibernate during De-Serialization...");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", courseStudents=" + courseStudents + "]";
	}
}
