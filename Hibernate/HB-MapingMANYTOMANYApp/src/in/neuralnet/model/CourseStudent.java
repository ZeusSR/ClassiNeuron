package in.neuralnet.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CourseStudent {


	@Id
	private String cid;
	private String cname;
	private Integer cost;
	
	

	public CourseStudent() {

	}

	public CourseStudent(String cid, String cname, Integer cost) {
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "CourseStudent [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}
}
