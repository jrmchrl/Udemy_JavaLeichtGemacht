import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(Anfangswert; Abbruchbedingung; Zähler){}
		//while(Bedingung){}
		
//		for(int i =1; i<=5; i++) {
//			System.out.println("Asteroid wurde erstellt Nr: " + i);
//			
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Drücke 1 für Schwierigkeitsgrad Leicht \nDrücke 2 für Schwierigkeitsgrad Mittel");
		
		int userEingabe = scan.nextInt();
		int anzahlGegner = 0; 
		
		if (userEingabe == 1) {
			anzahlGegner = 10;
		}else if (userEingabe == 2) {
			anzahlGegner = 15;
		}
		while(anzahlGegner !=0) {
			System.out.println("Gegner erstellt");
			anzahlGegner --;
			
		}

	}
}
