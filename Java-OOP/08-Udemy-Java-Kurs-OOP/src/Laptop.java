


public class Laptop {
	//Klassenvariable
	static int LaptopTasten = 94;
	
	//Eigenschaften
	int Ram;
	double Preis;
	String Marke;
	
	//Konstruktor
	public Laptop(int Ram, double Preis, String Marke) {
		this.Ram = Ram;
		this.Preis = Preis;
		this.Marke = Marke;
	}

	//Methode
	public void LaptopEigenschaften() {
		System.out.println("Der Laptop hat: " + this.Ram + " Ram, kostet "
				+ this.Preis + "€ und ist von der Marke: " + this.Marke);
	}
	

	public static void ausgabe() {
	System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt");
}
	
}
