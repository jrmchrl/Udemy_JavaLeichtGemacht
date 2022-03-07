
public class SchlüsselwortIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 5000;
		
		if (score==5000) {
			System.out.println("Herzlichen Glückwunsch! Neuer Rekord!");
		} 
		else {
			System.out.println("Schade zu geringer Score!");
		}

		int lebenPlayer = 0;
		
		if (lebenPlayer == 1) {
			System.out.println("Spiel verloren.");
		}
		 
		boolean gegnerHit = false;
		int highscore = 0;
				
		if (gegnerHit == true) {
			System.out.println("Gegner getroffen.");
			highscore += 10; 
			System.out.println("Highscore " + highscore);
			}else {
				System.out.println("Daneben");
			}
	}
}
