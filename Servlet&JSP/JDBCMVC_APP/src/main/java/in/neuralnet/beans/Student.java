package in.neuralnet.beans;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer sid;
	
	private String ssport;
	
	private Integer sage;
	
	private String sname;
	
	private String saddr;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", ssport=" + ssport + ", sage=" + sage + ", sname=" + sname + ", saddr=" + saddr
				+ "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSsport() {
		return ssport;
	}

	public void setSsport(String ssport) {
		this.ssport = ssport;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	
	
	
	
	

}
