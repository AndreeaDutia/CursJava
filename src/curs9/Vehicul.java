package curs9;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
    private int vitezaMedie;
    
    public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
    	
    	this.brand = brand;
    	this.nivelPoluare = nivelPoluare;
    	this.vitezaMedie = vitezaMedie;
    	}
	
    public String brand() {
    	return brand();
    }
    public int nivelPoluare() {
    	return nivelPoluare();
    }
    public int vitezaMedie() {
    	return vitezaMedie();
    }
    public String nume() {
        return nume();
    }
    public String motorizare() {
        return motorizare();
    }
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	public void detaliiVehicul() {
        System.out.println("Nivelul de poluare pentru " + brand + " este " + nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h.");
    }

  

}
