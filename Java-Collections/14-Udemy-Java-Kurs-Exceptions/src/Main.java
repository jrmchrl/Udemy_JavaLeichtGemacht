import java.util.Scanner;


import beispielPaket.NichtDurchNullTeilenException;
import beispielPaket.Taschenrechner;

public class Main {

	public static void main(String[] args) {
		
		//exception = Superklasse aller Fehler die es gibt
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("Bitte Zahl 1 eingeben.");
			int userZahl1 = scan.nextInt();
			System.out.println("Bitte Zahl 1 eingeben.");
			int userZahl2 = scan.nextInt();
		
			Taschenrechner.dividiere(10, 2);
			
		}catch(NichtDurchNullTeilenException e) {
		System.out.println("Man kann nicht durch 0 teilen");
		System.out.println("Bitte neue Zahl eingeben ...");
		int neueEingabe1 = scan.nextInt();
		int neueEingabe2 = scan.nextInt();
		
		e.getMessage();
		
		try {
			Taschenrechner.dividiere(neueEingabe1, neueEingabe2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Taschenrechner.plus(3, 6);

	}

}}
