package in.neuralnet.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="JobSeekers_tb")
public class Jobseeker implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	
	@Column(name = "vch_name")
	private String str_name;
	
	@Column(name = "vch_profile")
	private String str_profile;
	
	@Lob
	@Column(name = "photo")
	private byte[] byt_photo;
	
	@Lob
	@Column(name = "resume")
	private char[] char_resume;
	
	@Version
	private Integer int_version;
	
	@CreationTimestamp
	private LocalDateTime created_at;
	
	@UpdateTimestamp
	private LocalDateTime updated_at;

	@Override
	public String toString() {
		return "Jobseeker [pid=" + pid + ", str_name=" + str_name + ", str_profile=" + str_profile + ", byt_photo="
				+ Arrays.toString(byt_photo) + ", char_resume=" + Arrays.toString(char_resume) + ", int_version="
				+ int_version + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getStr_name() {
		return str_name;
	}

	public void setStr_name(String str_name) {
		this.str_name = str_name;
	}

	public String getStr_profile() {
		return str_profile;
	}

	public void setStr_profile(String str_profile) {
		this.str_profile = str_profile;
	}

	public byte[] getByt_photo() {
		return byt_photo;
	}

	public void setByt_photo(byte[] byt_photo) {
		this.byt_photo = byt_photo;
	}

	public char[] getChar_resume() {
		return char_resume;
	}

	public void setChar_resume(char[] char_resume) {
		this.char_resume = char_resume;
	}

	public Integer getInt_version() {
		return int_version;
	}

	public void setInt_version(Integer int_version) {
		this.int_version = int_version;
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

	
	
	
	
	
	
}
