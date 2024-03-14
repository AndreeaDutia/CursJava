package curs4;

public class TernaryOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		
		if(num1>num2) {
			System.out.println ("Num1 este mai mare");
		}else {
			System.out.println ("Num2 este mai mare");
		}
		// sintaxa operator ternar: 
		//variabila = conditie ? expresie daca conditie este true : expresie daca conditie este false
		//variabile= conditie ? true : false;
		
		String print = num1>num2 ? "Num1 este mai mare" : "Num2 este mai mare";
		System.out.println(print);
		System.out.println(num1>num2 ? "Num1 este mai mare" : "Num2 este mai mare");
	}
	

}
