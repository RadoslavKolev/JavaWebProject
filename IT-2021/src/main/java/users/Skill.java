package users;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="skill")
@XmlAccessorType(XmlAccessType.FIELD)

public class Skill implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String skillName;
	private int level;
	
	public Skill()
	{
		this.skillName="Умение";
		this.level=0;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
