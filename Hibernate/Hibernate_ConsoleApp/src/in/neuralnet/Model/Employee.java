package in.neuralnet.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empTab" )
public class Employee {
	
	@Id
	@Column(name="int_id")
	private Integer emp_id;
	
	@Column(name="vch_name")
	private String emp_name;
	
	@Column(name="flt_sal")
	private Double emp_sal;
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Double getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(Double emp_sal) {
		this.emp_sal = emp_sal;
	}
	
	
	
}
