package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
//public class PropertiesFileProcessor (String key, String value) {
	
	//white properties file
	
	public void writePropertiesFile() {
		
		try (OutputStream outputStream = new FileOutputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty("hostname", "123456"); //hostname = 123456
			propFile.setProperty("port", "8080");
			propFile.setProperty("username", "test");
			propFile.setProperty("password", "test123");
			propFile.store(outputStream, "am salvat fisierul");
			
			//propFile.setProperty (key, value);
			
			
			//outputStream.close();
			
			
			
		}catch (IOException e) {
			System.out.println("Nu am putut salva fisierul!");
			e.printStackTrace();
		}
		
	}
	
	//read properties file
	public void readPropertiesFile(String key) {
		try (InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.getProperty(key));
			
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
	}
	
	//update properties file
	public void updatePropertiesFile(String key, String value) {
		
		try (InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
						
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
		
		try (OutputStream outputStream = new FileOutputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty(key, value);
			propFile.store(outputStream, value);
						
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}

	}
}
