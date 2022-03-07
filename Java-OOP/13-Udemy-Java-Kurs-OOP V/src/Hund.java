
public class Hund extends Tier {
	
	//Eigenschaften / Attribute
	//von Superklasse
	int zaehne;
	
	//Konstruktor; Parameter werden mit hilfe des 
	//schlüsselwortes weitergeleitet und somit Konstruktor in Tier aufgerufen
	public Hund(String name, int groeße, int gewicht, int zaehne) {
		super(name, groeße, gewicht);
		this.zaehne = zaehne; 
		
	}
	
	
	// Methoden
	//von Superklasse
	public void bellen() {
		
	}
	
	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen");
	}


	@Override
	public void atmen() {
		System.out.println("Der Hund atmet über die Lunge");
		
	}

	
		

}
	
