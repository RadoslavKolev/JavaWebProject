package users;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)

public class User implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String personalName;
	private String userName;
	private String password;
	private String jobTitle;
	private String description;
	private String email;
	private String phone;
	private Address address;
	
	@XmlElementWrapper(name="proffesionalSkills")
	@XmlElement(name="skill")
	private ArrayList<Skill> proffesionalSkills;
	
	@XmlElementWrapper(name="personalSkills")
	@XmlElement(name="skill")
	private ArrayList<Skill> personalSkills;

	
	public User()
	{}

	public User(String personalName, String userName, String password) {
		
		this.personalName = personalName;
		this.userName = userName;
		this.password = password;
		this.jobTitle="не е зададена";
		this.description="не е зададено";
		this.email="не е зададен";
		this.phone="не е зададен";
		this.address = new Address();
		this.proffesionalSkills = new ArrayList<Skill>();
		this.personalSkills = new ArrayList<Skill>();
	}
	
	public User(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}


	public String getPersonalName() {
		return personalName;
	}

	public void setPersonalName(String personalName) {
		this.personalName = personalName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Skill> getProffesionalSkills() {
		return proffesionalSkills;
	}

	public void setProffesionalSkills(ArrayList<Skill> proffesionalSkills) {
		this.proffesionalSkills = proffesionalSkills;
	}

	public ArrayList<Skill> getPersonalSkills() {
		return personalSkills;
	}

	public void setPersonalSkills(ArrayList<Skill> personalSkills) {
		this.personalSkills = personalSkills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
