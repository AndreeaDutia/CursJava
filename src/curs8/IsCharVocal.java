package curs8;

import java.util.Scanner;

/*
 * facem un program care cere o litere si verifica daca este consoana sau vocala
 * rezolvare cu switch
 * citim litera de la tastatura
 */

public class IsCharVocal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu o litera: ");
		char litera = scan.next().charAt(0);
		
		//aeiouAEIOU
		
		if(litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u' || 
				litera == 'A' || litera == 'E' || litera == 'I' || litera == 'O' || litera == 'U') {
			System.out.println("Este vocala!");	
		}else {
			System.out.println("Nu este vocala!");	
		}
		
		System.out.println("------------------------------------------------------------");	
		
		switch (litera) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': System.out.println("Este vocala!");	
				break;
			default : System.out.println("Nu este vocala!");	
				
		}
		System.out.println("------------------------------------------------------------");	
		
		switch (litera) {
			case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> System.out.println("Este vocala!");	
			default -> System.out.println("Nu este vocala!");
		}
	}

}
