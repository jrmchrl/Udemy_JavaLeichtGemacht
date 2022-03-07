
public class Hund {

	//Eigenschaften/Attribute
	int alter;
	String name;
	String rasse;
	
	// Konstruktor der Objekt sofort befüllt
	public Hund(int alter, String name, String rasse) {
	this.alter = alter;
	this.name = name;
	this.rasse = rasse; 
		
	}
	
	//Methoden - Hund hat gewissen "Aufgaben"/ Funktionen
	public void bellen() {
		System.out.println("Der Hund: " + this.name + " bellt.");
	}
	
	
	
}
