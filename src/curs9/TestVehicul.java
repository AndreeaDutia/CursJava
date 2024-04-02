package curs9;

public class TestVehicul {
	
	 public static void verificaMotorizarea(Vehicul Vehicul) {
	        System.out.println(Vehicul.nume());
	        System.out.println(Vehicul.motorizare());
	    }

	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta("Pegas",0,25);
        Masina masina = new Masina("VW", 10, 150);
        
        bicicleta.detaliiVehicul();
        masina.detaliiVehicul();
        
        verificaMotorizarea(bicicleta);
        verificaMotorizarea(masina);
        
	}

	

		
}
