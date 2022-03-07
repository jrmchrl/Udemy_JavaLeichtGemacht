
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl = 4;
		System.out.println(zahl);
		
		// Datentyp variableNamen = new Konstruktor();
		/*Auto bmw = new Auto();
		/System.out.println(bmw);
		/bmw.preis = 5000;
		/bmw.marke = "BMW";
		
		/System.out.println("Preis: " + bmw.preis + " Marke: " + bmw.marke);
		*/
		
		Auto audi = new Auto(4,5000, "Audi");
		System.out.println("Reifenanzahl: " + audi.reifen + " Preis: " + audi.preis + " Marke: " + audi.marke);
		
		audi.gasgeben();
		audi.bremsen();
		
		audi.vergleichePreis(4000);
	}

}
