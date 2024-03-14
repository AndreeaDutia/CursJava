package curs4;

/*
 * operator unar: are un singur operand. ex: numar++ ==> numar = numar + 1
 * operatori binari: doi operanzi. ex: var > var2
 * operator ternar: trei operanzi (operator conditional) ? :
 * 
 */


public class IncrementDecrement {

	public static void main(String[] args) {

		 
		
		//POST increment --> numar++
		//PRE increment ->> ++numar
		
		//POST decrement --> numar-- (numar = numar - 1) -> scadere dupa executie
		//PRE decrement --> --numar --> intai face scaderea, apoi executia
		
		System.out.println("---POST---");
		int num = 10;
		System.out.println("Valoarea lui num intainte de increment:" + num);
		System.out.println("Valoarea lui num in POST increment:" + num++); //num++ --> num + 1
		System.out.println("Valoarea lui num dupa POST increment:" + num);
		
		
		System.out.println("---PRE---");
		int num2 = 10;
		System.out.println("Valoarea lui num intainte de increment:" + num2);
		System.out.println("Valoarea lui num in PRE increment:" + ++num2);
		System.out.println("Valoarea lui num dupa PRE increment:" + num2);
		
	}

}
