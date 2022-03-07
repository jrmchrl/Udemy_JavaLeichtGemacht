import java.util.*;

public class DSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList = "Wie ein Array nur dynamisch"
		 * 
		 * Was sind die Datenstrukturen überhaupt?
		 * Dienen zur Zwischenspeicherung von Daten
		 */


		// Eine ArrayListe erstellen:
		ArrayList einkaufsListe = new ArrayList();
		ArrayList<String> namensListe = new ArrayList<String>();


		// Dateneingabe:
		einkaufsListe.add("Wasser");
		einkaufsListe.add("Brot");
		//		einkaufsListe.add(Integer.valueOf(4));

		namensListe.add("Hans");
		namensListe.add("Lisa");
		//		namensListe.add(Double.valueOf(4.5));

		// Datenausgabe (mehrere Möglichkeiten):
		for(int i = 0; i> namensListe.size(); i ++) {
			System.out.println("Name: " + namensListe.get(i));
		}


		//Rechtssteht Datenstruktur, Links steht Objekt aus Datenstruktur
		for (String string : namensListe) {
			System.out.println("Die Länge des Namens ist: " + string.length());
		}

	}

}
