package curs9;

public class Bicicleta extends Vehicul {
	
	
	public Bicicleta (String brand, int nivelPoluare, int vitezaMedie) {
	super(brand, nivelPoluare, vitezaMedie);
	
    	}
	

	@Override
	public String nume() {
		return  super.nume = "Bicicleta";
    }
	
	@Override
    public String motorizare() {
        return  super.motorizare = "Nu are motor";
    }
	
	@Override
    public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + super.brand() + " este " + super.nivelPoluare() + " si viteza medie atinsa este de " + super.vitezaMedie() + " km/h.");
    }
  
}