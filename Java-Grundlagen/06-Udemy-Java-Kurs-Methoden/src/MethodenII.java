
public class MethodenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator Rückgabetyp Methodenname (Datentyp Parameter 1, Datentyp
		// Parameter2)>
		// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public,
		// private, protected
		// Merke: Eine MEthode erledigt eine bestimmte Aufgabe

//		for(int i = 1; i <= 10; i++) {
//			erstelleGegner();
//		}
//	
		
		erstelleGegner("Peter", 100);
		erstelleGegner("Olaf", 80);
		

	}
//	
//	public static void erstelleGegner() {
//		String gegnerName = "Olaf";
//		int gegnerLeben = 100;
//		System.out.println("Gegner wurde erstellt");
//	}

	public static void erstelleGegner(String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegner wurde erstellt " + gegnerName + " LP: " + gegnerLeben);
	}

}
