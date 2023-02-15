package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int stdid;
	private String stdname;
	private String stdph;
	private String dob;
	private String gender;
	private String state;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdph() {
		return stdph;
	}
	public void setStdph(String stdph) {
		this.stdph = stdph;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	

}
