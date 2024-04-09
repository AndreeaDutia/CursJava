package curs11;

public class TestCalorii {

	public static void main(String[] args) {
		Calorii obj = new Calorii();
		//obj.writePropertiesFile();	
		obj.readPropertiesFile("morcov");
		obj.readPropertiesFile("rosie");
		obj.readPropertiesFile("vanata");
		obj.readPropertiesFile("castravete");
		obj.readPropertiesFile("ardei");
		
		
	}

}
