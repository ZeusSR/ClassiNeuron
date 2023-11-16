package in.neuralnet.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private String deptId;

	private String deptName;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee2> employee2s;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee2> getEmployees() {
		return employee2s;
	}

	public void setEmployees(Set<Employee2> employee2s) {
		this.employee2s = employee2s;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employee2s=" + employee2s + "]";
	}

}
