package users;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private String city;
	private String street;
	
	public Address()
	{
		this.city="не е зададен";
		this.street="не е зададена";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
}
