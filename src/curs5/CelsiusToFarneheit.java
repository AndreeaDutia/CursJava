package curs5;

import java.util.Scanner;

public class CelsiusToFarneheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Cate temperaturi doriti sa transformati? ");
        int nrTemperaturi = scanner.nextInt();

        for (int i = 1; i <= nrTemperaturi; i++) {
            System.out.print("Introduceti temperatura in grade Celsius: ");
            
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperatura Celsius de " + celsius + " grade este în Fahrenheit " + fahrenheit + " grade");
        }

        scanner.close();
    }
}