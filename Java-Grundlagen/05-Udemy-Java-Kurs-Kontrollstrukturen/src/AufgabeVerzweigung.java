import java.util.Scanner;

public class AufgabeVerzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if else (maximal drei Fälle mit if else, sonst switch)
		// switch
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("5 oder 3 oder 16 oder 30");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int eingabeUser = scan.nextInt();
		
		if(eingabeUser == 15) {
			System.out.println("Das ist falsch");
			}else if(eingabeUser == 3) {
				System.out.println("Das ist richtig !!");
				System.out.println("Wie heißt der Bundespräsident?");
			}else if(eingabeUser == 30) {
				System.out.println("Das ist falsch");
			}
		
		}

	}
