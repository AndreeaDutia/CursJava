package curs9;

public class Masina extends Vehicul {
	
	public Masina (String brand, int nivelPoluare, int vitezaMedie) {
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
