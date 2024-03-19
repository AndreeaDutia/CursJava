package curs5;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter a number: ");
	        int nr = scanner.nextInt();

	        System.out.println("Multiplication table for " + nr + " is:");
	        for (int i = 1; i <= 10; i++) {
	            int result = nr * i;
	            System.out.println(nr + " * " + i + " = " + result);
	        }
	    }
	}



       