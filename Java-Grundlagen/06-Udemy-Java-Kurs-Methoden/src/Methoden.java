
public class Methoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//keine zweite Methode darf innerhalb von Methode definiert werden
		// return (also ausgabe() und summe() in diesem Fall) ist das schlüsselwort um die methode auszugeben
		
		ausgabe();
		summe();
	}
	
	public static void ausgabe() {
		System.out.println("Ich bin eine Methode");
	
	}

	public static void summe() {
		int a,b, summe;
		a = 5;
		b = 5;
		
		summe = a + b;
		System.out.println(summe);
	}
}
