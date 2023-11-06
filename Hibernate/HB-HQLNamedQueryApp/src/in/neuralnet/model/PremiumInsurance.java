package in.neuralnet.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="premium_insurance_tb")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class PremiumInsurance implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long pid;
	
	private String Policyname;
	
	private String CompanyName;
	
	private LocalDateTime docommencement;
	
	@Version
	private Integer version;
	
	@CreationTimestamp
	private LocalDateTime created_at;
	
	@UpdateTimestamp
	private LocalDateTime updated_at;
	
	
	private Integer tenure;


	@Override
	public String toString() {
		return "Insurance [pid=" + pid + ", Policyname=" + Policyname + ", CompanyName=" + CompanyName
				+ ", docommencement=" + docommencement + ", version=" + version + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", tenure=" + tenure + "]";
	}


	public Long getPid() {
		return pid;
	}


	public void setPid(Long pid) {
		this.pid = pid;
	}


	public String getPolicyname() {
		return Policyname;
	}


	public void setPolicyname(String policyname) {
		Policyname = policyname;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public LocalDateTime getDocommencement() {
		return docommencement;
	}


	public void setDocommencement(LocalDateTime docommencement) {
		this.docommencement = docommencement;
	}


	public Integer getVersion() {
		return version;
	}


	public void setVersion(Integer version) {
		this.version = version;
	}


	public LocalDateTime getCreated_at() {
		return created_at;
	}


	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}


	public LocalDateTime getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}


	public Integer getTenure() {
		return tenure;
	}


	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	
	
	
	
	
}
