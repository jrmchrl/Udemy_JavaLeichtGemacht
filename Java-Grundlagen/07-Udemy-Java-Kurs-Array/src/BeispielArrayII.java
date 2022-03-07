import java.util.Scanner;

public class BeispielArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] fragen = {"Wie viel ist 5+4?", "Wie viel ist 3*5?"};
		int[] antworten = {9,15};
		
		int count = 0;
		while(count<fragen.length) {
			System.err.println(fragen[count]);
			
			Scanner scan = new Scanner(System.in);
			int eingabeUser = scan.nextInt();
			
			if (eingabeUser == antworten[count]) {
				System.out.println("Richtig");
				count ++;
			}else {System.out.println("Das ist falsch");
				
			}
		
		}
		
	}

}
