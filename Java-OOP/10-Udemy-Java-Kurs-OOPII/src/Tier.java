
public class Tier {
	//Eigenschaften / Attribute
	String name;
	int gewicht;
	int groeße;
		
	//Konstruktor
	public Tier(String name, int groeße, int gewicht) {
		this.name = name;
		this.groeße = groeße;
		this.gewicht = gewicht;
		
	}
	
	//Methoden
	public void essen() {
		System.out.println("Das Tier hat gegessen");
		
	}
}
