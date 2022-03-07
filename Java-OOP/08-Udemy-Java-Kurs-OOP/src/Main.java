
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl = 4;
		System.out.println(zahl);
		
		// Datentyp variableNamen = new Konstruktor();
		Hund bello = new Hund(4,"bello", "Hovawart");
		bello.alter = 2;
		// Methoden sollten in OOP immer von Objekten aufgerufen werden
		bello.bellen();
		
		Hund klara = new Hund(5, "klara","Hovawart");
		klara.bellen();
		
		Laptop HP = new Laptop(32, 3000.4, "HP");
		HP.LaptopEigenschaften();
		
		Laptop Samsung = new Laptop(8, 600, "Samsung");
		Laptop medion = new Laptop(4, 400, "Medion");
		Samsung.LaptopEigenschaften();
		medion.LaptopEigenschaften();
		
		//Klassenmethode
		Laptop.ausgabe();
		
		
	}

}
