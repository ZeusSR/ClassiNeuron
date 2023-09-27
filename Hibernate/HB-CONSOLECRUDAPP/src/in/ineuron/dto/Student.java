package in.ineuron.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//DTO-> Data Transfer Object

@Entity
@Table(name="studentTB" )
public class Student implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="int_id")
	private Integer sid;
	
	@Column(name="vch_name")
	private String name;
	
	@Column(name="vch_mail")
	private String email;
	
	@Column(name="vch_city")
	private String city;
	
	@Column(name="vch_country")
	private String country;

	static {
		System.out.println("Student.class is loading...");
	}

	public Student() {
		System.out.println("Student Object created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", city=" + city + ", country=" + country
				+ "]";
	}

}
