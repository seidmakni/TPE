package DeHsMannheimSS17TPEGrp01�bung2;

import java.util.Scanner;

public class Portfolio {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String [] kunden = new String[10];
		System.out.println("Account erstellen: ...");

		byte i = 0;
		byte eingabe;
		do{
			System.out.println("1: neue Konto Anlegen");
			System.out.println("2: Auslesen der Liste aller Vermogenswerte");
			System.out.println("3: Auslesen der Gesamtinvestition, die in dem Portfolio steckt");
			System.out.println("4: Auslesen des aktuellen Zeitwertes des Portfolios");
			System.out.println("5: Auslesen des aktuellen Gewinns bzw. Verlusts des Portfolios");
			System.out.println("6: Beenden");
			eingabe = s.nextByte();
			switch (eingabe) {
			case 1:
				System.out.println("Name und Nachname eingaben bitte");
				kunden[i] = s.nextLine();
				i++;
				break;
			case 2:
				System.out.println(kunden[i]);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:	
				break;
			default:
				break;
			}
		}while (eingabe != 6);

	}
}
