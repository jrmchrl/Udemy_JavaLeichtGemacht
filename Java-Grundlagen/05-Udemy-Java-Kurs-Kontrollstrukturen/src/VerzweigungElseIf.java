
public class VerzweigungElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kontrollstrukturen steuern den Programmablaufplan
		
		//if = falls
		//else = ansonsten
		
		int i = 1;
				
		if(i ==1) {
			System.out.println("Zahl in i ist: " + i);
		}
		else if ( i >= 1) {
			System.out.println("Zahl in i ist: " + i);
		}
		else if (i <= 1) {
			System.out.println("Zahl in i ist: " + i);
		}
		
		int score = 0;
		
		if(score == 1000) {
			System.out.println("Du hast 1 Stern von 3 Sternen erhalten");
		}
		else if (score == 5000) {
			System.out.println("Du hast 2 Sterne von 3 Sternen erhalten");
		}
		else if (score > 5000) {
			System.out.println("Du hast 3 von 3 Sternen erhalten!");
			int lebenPlayer = 1;
			System.out.println("Deine Leben betragen: " + lebenPlayer);
		}
	}
}
