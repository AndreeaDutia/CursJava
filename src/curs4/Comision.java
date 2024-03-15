package curs4;

/*public static void main(String[] args) {
 * int comision;
 * int vanzari = 3500;
 * comison = (vanzari>2500)?vanzari*5/100:0;
 * System.out.println("Comisionul tau este :" + comision); 
 */

public class Comision {

	public static void main(String[] args) {
		int comision;
		int vanzari = 3500;
		
		if(vanzari>2500) {
			System.out.println ("Comisionul tau este :" + vanzari*5/100);
		}else {
			System.out.println ("Comisionul tau este :" + 0);
		}

	}

}
