
public class MethodenReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int summe = taschenrechner(5,5, '+');
		System.out.println(summe);
		
	}

	public static int taschenrechner(int Zahl1, int Zahl2, char operator) {
		int summe;
		
		if (operator == '+') {
			summe = Zahl1 + Zahl2;
		}else {
			summe = Zahl1 - Zahl2;
		}
		
	return summe;
	}
}
