
public class Auto {
	
	int reifen;
	int preis;
	
	String marke;
	
	
	// Konstruktor: heißt immer wie die Klasse selbst 
	public Auto(int reifen, int preis, String marke) {

		this.reifen = reifen;  //this gibt zugriff auf
		this.preis = preis; 
		this.marke = marke;
		
	}
		
	// Methoden
		
	public void gasgeben() {
		System.out.println("Das Auto mit der Marke: " + this.marke + " fährt jetzt los.");
	}
	
	// this geht zur Variable z.B. Marke und gibt diese aus
	
	public void bremsen() {
		System.out.println("Das Auto mit der Marke: " + this.marke + " bremst jetzt.");
	}
	
	public void vergleichePreis(int preis) {
		if (this.preis <= preis) {
			System.out.println("Der " + this.marke + " ist billiger");
		}else {
			System.out.println("Der " + this.marke + " ist teurer");
		}
	}
}
