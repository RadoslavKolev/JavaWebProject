package users;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import xml.XMLWorker;

@XmlRootElement(name="users")
@XmlAccessorType(XmlAccessType.FIELD)

public class UserCollection {
	
	private static UserCollection instance = null;
	
	@XmlElement(name="user")

	private static Set<User> collection = new HashSet<User>();
	static int index=1;
	
	private static String fileName = "D:\\ТУ Варна\\Семестър 6\\Интернет технологии\\gr3b\\IT-2021\\src\\main\\webapp\\storage\\users.xml";
	private static String schema = "D:\\ТУ Варна\\Семестър 6\\Интернет технологии\\gr3b\\IT-2021\\src\\main\\webapp\\storage\\MyXMLSchema1.xsd";
	
	private UserCollection()
	{}
	
	public static UserCollection getInstance()
	{
		if(instance == null)
		{
			XMLWorker worker = new XMLWorker();
			try {
				instance = worker.readFromXmlFile(fileName, schema);
				instance.index = instance.collection.size() + 1;
			} catch (FileNotFoundException | UnsupportedEncodingException | JAXBException e) {
				e.printStackTrace();
			}
		}
		
		return instance;
	}

	public void addUser(User user)
	{
		user.setId(index++);
		collection.add(user);
		update();
	}
	
	public User getUser(String userName)
	{
		for(User u:collection)
		{
			if(u.getUserName().equals(userName))
			{
				return u;
			}
		}
		
		return null;
	}
	
	
	public User getById(int id)
	{
		User user = null;
		for(User u:collection)
			
		{
			if(id==u.getId())
			{
				user = u;
			}
		}
		
		return user;	
	}
	
	public boolean checkifExist(User user)
	{
		return collection.contains(user);
	}
	
	public Set<User> getUsers()
	{
		return collection;
	}
	
	public void update()
	{
		XMLWorker worker = new XMLWorker();
		try {
			worker.writeToXmlFile(fileName, this);
		} catch (JAXBException e) {
			e.printStackTrace();
		}	
	}
}
