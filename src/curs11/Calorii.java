package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

/*
 * Scriem un program care printeaza in consola cate calorii are o leguma pe care utilizatorul vrea sa o cumpere.
u Avem o metoda care scrie intr-un properties file 5 legume si un numar de calorii asociat lor (exemplu morcov=58)
u Avem o metoda care citeste si din properties file valoarea caloriilor.
u Daca utilizatorul introduce o leguma care nu se afla in acest data structure returneaza “Nu vindem aceasta leguma”
u In metoda main intrebam utilizatorul ce leguma vrea sa cumpere.
Daca leguma se afla in cele pe care le avem in data structure printam : “Leguma aleasa de tine are X calorii”. 
Daca nu se afla printam “Nu vindem aceasta leguma” si rugam utilizatorul sa aleaga alta leguma.
 */

public class Calorii {

	public void writePropertiesFile() {
		
		try (OutputStream outputStream = new FileOutputStream("legume.properties")) {
			
			Properties propFile1 = new Properties();
			propFile1.setProperty("morcov", "58"); 
			propFile1.setProperty("rosie", "26");
			propFile1.setProperty("vanata", "24");
			propFile1.setProperty("castravete", "12");
			propFile1.setProperty("ardei", "38");
			propFile1.store(outputStream, "Am salvat fisierul");
			
						
		}catch (IOException e) {
			System.out.println("Nu am putut salva fisierul!");
			e.printStackTrace();
		}
		
	}
	
		
	public void readPropertiesFile(String key) {
		try (InputStream inputStream = new FileInputStream("legume.properties")) {
			
			Properties propFile1 = new Properties();
			propFile1.load(inputStream);
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduceți leguma dorită: ");
		    String leguma = scanner.nextLine() ;
		    		    
		    if (propFile1.containsKey(leguma)) {
		    	String calorii = propFile1.getProperty(leguma);
		    	System.out.println("Leguma aleasa de tine are " + calorii + " calorii.");
		    } else {
		    	System.out.println("Nu vindem această legumă. Vă rugăm să alegeți alta.");
		    }
						
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
	}
	
	
	
	
}
