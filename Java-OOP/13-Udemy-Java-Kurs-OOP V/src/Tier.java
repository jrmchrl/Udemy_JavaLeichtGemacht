
public abstract class Tier {
	//Eigenschaften / Attribute
	String name;
	int gewicht;
	int groeße;
		
	//Konstruktor
	public Tier() {
		
	}
	public Tier(String name, int groeße, int gewicht) {
		this.name = name;
		this.groeße = groeße;
		this.gewicht = gewicht;
		
	}
	
	//Methoden
	public abstract void essen(); // = Zeile ist eine Methodensignatur/ ein Methodenkopf
	public abstract void atmen();
	public String getName() {
		return name;
	}
	}

