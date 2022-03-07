
public class MethodenReturnII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = summe();
		System.out.println("Der Wert aus der Methode Summe() ist: " + a);
		int summe = a- 5;
		System.out.println("Der Wert in Summe ist: " + summe);
	}

	public static int summe() {
		int a, b, summe;  //lokale variablen: sind nach Nutzung der Methode weg, deswegen muss in main neue Variable für return Wert Summe erstellt werden sowie return in Methode summe(), damit neue errechnete Variable weiter genutzt werden kann (siehe oben int a)
		a=5;
		b=5;
		
		summe = a + b;
		
		return summe; //am ende gibt methode wert die sie durch aufgabe berechnet hat zurück; dieser wird in a gespeichert
	}
}
