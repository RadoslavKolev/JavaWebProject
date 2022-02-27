package xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import users.UserCollection;

public class XMLWorker {
	
	public void writeToXmlFile(String xmlFile, UserCollection collection) throws JAXBException
	{
		JAXBContext context = JAXBContext.newInstance(UserCollection.class);		
		Marshaller m = context.createMarshaller();	
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);	
		m.marshal(collection, new File(xmlFile));
	}
	
	public UserCollection readFromXmlFile(String xmlFile, String xsdFile) throws JAXBException, FileNotFoundException, UnsupportedEncodingException 
	{
		JAXBContext context = JAXBContext.newInstance(UserCollection.class);	
		Unmarshaller um = (Unmarshaller) context.createUnmarshaller();		
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);		
		Schema schema = null;
		
		try {
			schema = sf.newSchema(new File(xsdFile));
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		um.setSchema(schema);		
		InputStream inputStream = new FileInputStream(xmlFile);	
		Reader reader = new InputStreamReader(inputStream, "UTF-8");	
		UserCollection collection = (UserCollection) um.unmarshal(reader);
		
		return collection;
	}

}
