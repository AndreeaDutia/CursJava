package curs9;

public class Masina extends Vehicul {
	
	public Masina (String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
		
	    	}
	
	@Override
	public String nume() {
        return super.nume = "Masina";
    }
	
	@Override
    public String motorizare() {
        return  super. motorizare = "Motor masina";
    }
	
	@Override
    public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + super.brand() + " este " + super.nivelPoluare() + " si viteza medie atinsa este de " + super.vitezaMedie() + " km/h.");
    }
	   
	}
