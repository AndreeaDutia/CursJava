package curs2;

public class TestRoom {

	public static void main(String[] args) {

		Room baie = new Room(4, 2);
		System.out.println("Perimetru baie este: " + baie.calculPerimetru());
		System.out.println("Arie baie este: " + baie.calculArie());
		
		Room dormitor = new Room(8, 6, "Alb");
		System.out.println("Perimetru dormitor este: " + dormitor.calculPerimetru());
		System.out.println("Arie dormitor este: " + dormitor.calculArie());
		System.out.println("Culoare dormitor este: " + dormitor.afiseazaCuloareDreptunghi());
		
		Room camera = new Room(10, 5, "Alb");
		System.out.println("Perimetru camera este: " + camera.calculPerimetru());
		System.out.println("Arie camera este: " + camera.calculArie());
		System.out.println("Culoare camera este: " + camera.afiseazaCuloareDreptunghi());
		
			
	}

}
