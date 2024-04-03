package curs9;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
    private double vitezaMedie;
	public String nume;
	public String motorizare;
    
    public Vehicul(String brand, int nivelPoluare, double vitezaMedie) {
    	
    	this.brand = brand;
    	this.nivelPoluare = nivelPoluare;
    	this.vitezaMedie = vitezaMedie;
    	}
	
    public String brand() {
    	return brand;
    }
    public int nivelPoluare() {
    	return nivelPoluare;
    }
    public double vitezaMedie() {
    	return vitezaMedie;
    }
    public String nume() {
        String nume = "Vehicul";
		return "Numele este : " + nume;
    }
    public String motorizare() {
        String motorizare = "Motorizare";
		return "Motorizarea este : " + motorizare;
    }
    
	public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + brand + " este " + nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h.");
    }

  

}
