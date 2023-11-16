package in.neuralnet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee2 {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	private String ename;
	private float salary;
	private String eaddress;

	public Employee2(String ename, float salary, String eaddress) {
		this.ename = ename;
		this.salary = salary;
		this.eaddress = eaddress;
	}

	public Employee2() {
		System.out.println("used by hibernate internally....");
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", eaddress=" + eaddress + "]";
	}

}
