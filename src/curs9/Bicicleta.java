package curs9;

public class Bicicleta extends Vehicul {
	
	
	public Bicicleta (String brand, int nivelPoluare, int vitezaMedie) {
	super(brand, nivelPoluare, vitezaMedie);
    	}
	
	public String nume() {
        return "Nume este " + super.nume();
    }
    public String motorizare() {
        return "Motorizarea este: " + super. motorizare();
    }
    public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + super.brand() + " este " + super.nivelPoluare() + " si viteza medie atinsa este de " + super.vitezaMedie() + " km/h.");
    }
  
}