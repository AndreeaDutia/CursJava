package curs7;

import java.util.Scanner;

/*
 * facem un program care valideaza o parola pe baza unor reguli
 * regulile sunt:
 * 1. parola trebuie sa fie minim 10 caractere
 * 2. parola trebuie sa contina cel putin un uppercase
 * 3. parola nu trebuie sa fie la fel ca username
 * 
 * 
 * la rulare:
 *  - informam care sunt regulile parolei
 *  - intrebam utilizatorul un username si o parola
 * 
 * Daca parola este valida, atunci printam "Parola valida!"
 * Daca nu, il informam care dintre reguli nu au fost respectate si il tinem in loop pana parola este valida 
 * 
 * 1. o metoda care printeaza regulile parolei
 * 2. o metoda pentru user 
 * 3. o metoda care cere parola
 * 4. o metoda pentru validare
 */

public class PasswordValidator {
	Scanner scan = new Scanner(System.in);
	String username;
	String parola;
	boolean isInvalid;
	
	public void printPasswordRules() {
	System.out.println("Regulile parolei sunt: ");
	System.out.println("parola trebuie sa fie minim 10 caractere");
	System.out.println("parola trebuie sa contina cel putin un uppercase");
	System.out.println("parola nu trebuie sa fie la fel ca username");
}
	public void getUserName() {
		System.out.println("Introdu un username: ");
		 username = scan.next();
	}
	
	public void getPassword() {
		System.out.println("Introdu o parola: ");
		parola = scan.next();
	}
	public void checkPasswordRules() {
		isInvalid = false;
		
		if(parola.length()<10) {
			System.out.println("1. parola trebuie sa fie minim 10 caractere");
			isInvalid = true;
		}
		//Masina123-> il transform in lowercase si il compar cu valoarea initiala
		//valoare initiala = Masina123
		//valoare transformata = masina123
		//valoareInitiala.equals(valoareTransformata)
		if(parola.equals(parola.toLowerCase())) {
			System.out.println("2. parola trebuie sa contina cel putin un uppercase");
			isInvalid = true;
		}
		if(parola.equals(username)) {
			System.out.println("3. parola nu trebuie sa fie la fel ca username");
			isInvalid = true;
		}
	}
	
	public void validatePassword() {
		do {
			getPassword();
			checkPasswordRules();
		}while(isInvalid); //isValid == false;
		System.out.println("Parola este valida!");
	}
}

