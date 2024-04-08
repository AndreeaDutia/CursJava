package curs10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Scriem un program care reprezinta un catalog.
u Contine Numele si Notele unor elevi (un nume, o nota de fiecare J)
u Intrebam elevul cum il cheama si ce nota a luat.
u Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota si printam “Nu aveai nota, ti-am trecut acum!”
u Daca elevul se regaseste si nota este mai mica decat nota existenta in catalog, printam “Nu ai nevoie de alta nota”
u Daca elevul se regasete si noua nota este mai mare decat nota din catalog, facem update catalogului cu noua nota.
u La final indiferent de situatie printam catalogul.
 */

public class Catalog {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> catalog = new HashMap<>();

        while (true) {
            System.out.print("Introdu numele elevului (sau 'gata' pentru a încheia): ");
            String numeElev = scanner.nextLine();

            if (numeElev.equalsIgnoreCase("gata")) {
            break;
            }

            System.out.print("Introdu nota elevului: ");
            int notaElev = scanner.nextInt();
            scanner.nextLine(); // Consumăm newline

            if (catalog.containsKey(numeElev)) {
                int notaExistenta = catalog.get(numeElev);
                if (notaElev < notaExistenta) {
                    System.out.println("Nu ai nevoie de alta nota.");
                } else {
                    catalog.put(numeElev, notaElev);
                    System.out.println("Catalog actualizat cu noua nota.");
                }
            } else {
                catalog.put(numeElev, notaElev);
                System.out.println("Nu aveai nota, ți-am trecut acum!");
            }
        }

        System.out.println("Catalogul final:");
        for (Map.Entry<String, Integer> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}