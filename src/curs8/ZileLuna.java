package curs8;

import java.util.Scanner;

/*
 * Scriem un program care verifica cate zile are o luna pe care o citim de la tastatura
* Intrebam userul o luna si un an
* Ex: userul cere februarie 2024 à printam 29 zile
* Daca cere februarie 2023 à printam 28 de zile
* Etc
* Tratam toate lunile anului si conform exemplului de mai sus tratam si daca este sau nu an bisect J
 */

public class ZileLuna {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu o luna:");
		String luna = scan.next().toLowerCase();
		//int luna1 = scan.nextInt();
		System.out.println("Introdu un an:");
		int an = scan.nextInt();
		
		
		switch(luna) {
		case "ianuarie":
		case "martie":
		case "mai":
		case "iulie":
		case "august":
		case "octombrie":
		case "decembrie":
			System.out.println("Luna " + luna + " din anul " + an + " are 31 de zile");
			break;
		case "aprilie":
		case "iunie":
		case "septembrie":
		case "noiembrie":
			System.out.println("Luna " + luna + " din anul " + an + " are 30 de zile");
			break; 
		case "februarie":
			if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0)) {
				System.out.println("Luna " + luna + " din anul " + an + " are 29 de zile");
	        } else {
	        	System.out.println("Luna " + luna + " din anul " + an + " are 28 de zile");
	        }
			        break;
	      default:
	    	  System.out.println("Luna introdusă nu este validă."); 
	    	  break;
		}
/*			
		System.out.println("____________________________________________");
		
	
	
		switch(luna1) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("Luna " + luna1 + " din anul " + an + " are 31 de zile");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("Luna " + luna1 + " din anul " + an + " are 30 de zile");
		break; 
	case 2:
		if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0)) {
			System.out.println("Luna " + luna1 + " din anul " + an + " are 29 de zile");
        } else {
        	System.out.println("Luna " + luna1 + " din anul " + an + " are 28 de zile");
        }
		        break;
      default:
    	  System.out.println("Luna introdusă nu este validă."); 
    	  break;
	}*/
		
	
	} 
}
