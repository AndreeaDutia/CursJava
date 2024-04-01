package curs9;

/*
 * method override - suprascrierea metodei
 * implica o relatie de mostenire pentru ca suprascrierea se face in clasa copil (subclasa), si presupune scrierea identica a metodei
 * din clasa parinte (superclasa) DAR cu o alta implementare
 * - este best practice ca metoda suprascrisa sa aiba adnotarea @override
 */
public class TestWildAnimal {

	public static void main(String[] args) {
		
		Lion simba = new Lion();
		simba.makeSound(); //metoda suprascrisa
		simba.whereDoesItLives();
		simba.eatMeat();
		
		System.out.println("------------------------------------");
		
		Dear bambi = new Dear();
		bambi.makeSound();//method override
		bambi.whereDoesItLives();
		bambi.eatGrass();
		
	}

}
