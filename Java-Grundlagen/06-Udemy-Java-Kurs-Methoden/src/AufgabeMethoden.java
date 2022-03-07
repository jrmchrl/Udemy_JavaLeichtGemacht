
public class AufgabeMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		double wertEins = 3.547;
		double wertZwei = 6.354;

		double ergebnisMulti = multipliziere(wertEins, wertZwei);
		
		System.out.println("Ergebnis " + ergebnisMulti);
	
	}
	
	
	static double multipliziere(double wertEins, double wertZwei) {
		double ergebnisMulti = wertEins * wertZwei;

		return ergebnisMulti;
		                                                                                         
		
	}

}
