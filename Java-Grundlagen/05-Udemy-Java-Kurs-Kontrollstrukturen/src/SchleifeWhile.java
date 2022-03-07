
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while = solange
		
		/* Allgemeiner Aufbau einer while-Schleife
		 * 
		 * while(Bedingung){
		 * 
		 * 				Anweisungsblock
		 * 
		 * }
		 * 
		 * 
		 * Merke: Bedingung kann entweder true oder false sein
		 * 
		 */
		
		
		int count = 1;
//		while(count != 6) {
//			System.out.println("Ich bin " + count);
//			count ++;
//		}
		
		while(true) {
			System.out.println("Hi");
			if (count == 3) {//true
				break;
			}
			count++; //Zähler
		}
	}

}
