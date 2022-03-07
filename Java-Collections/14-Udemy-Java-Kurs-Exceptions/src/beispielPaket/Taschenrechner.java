package beispielPaket;

public class Taschenrechner {
	
	//Attribute
	
	//Konstruktor
	
	//Methoden
	
	//Static macht aus Methoden keine Objektmethoden, 
	public static void plus(int userZahl1, int userZahl2) {
		System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
	}
	
	public static void minus(int userZahl1, int userZahl2) {
		System.out.println("Ergebis: " + (userZahl1 - userZahl2));
	}
	
	public static void dividiere(int userZahl1, int userZahl2) throws Exception{
		if (userZahl2 == 0) {
			throw new NichtDurchNullTeilenException("Hey du darfst keine Null eintippen");
		}else {
		System.out.println("Ergebnis: " + (userZahl1 / userZahl2));}
	}

}
