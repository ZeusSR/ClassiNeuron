package in.neuralnet.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UsersTB")
public class Users implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="int_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	
	@Column(name="vch_name")
	private String sname;
	
	@Column(name="vch_mail")
	private String semail;
	
	@Column(name="vch_country")
	private String scountry;
	
	@Column(name="vch_sports")
	private String ssports;

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", sname=" + sname + ", semail=" + semail + ", scountry=" + scountry + ", ssports="
				+ ssports + "]";
		
		
		
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getScountry() {
		return scountry;
	}

	public void setScountry(String scountry) {
		this.scountry = scountry;
	}

	public String getSsports() {
		return ssports;
	}

	public void setSsports(String ssports) {
		this.ssports = ssports;
	}
	
	
	

}
