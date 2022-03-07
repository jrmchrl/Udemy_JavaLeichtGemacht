import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] lottoZahlen = new int[6];
		
		for(int i = 0; i < lottoZahlen.length; i++) {
			Scanner scan = new Scanner(System.in);
			int zahlUser = scan.nextInt();
			
			lottoZahlen[i] = zahlUser;
			
		}
		
		for(int i = 0 ; i < lottoZahlen.length; i++) {
		System.out.println(lottoZahlen[i]);
		}
	
		//Merke: Index = Anzahl der Elemente - 1

	}

}
