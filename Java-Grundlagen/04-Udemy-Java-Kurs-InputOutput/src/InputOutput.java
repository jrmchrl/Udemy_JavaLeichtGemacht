import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte eine Rosenart eintippen");
		String rose = scan.next();
		System.out.println("Bitte eine weitere Rosenart eintippen");
		String rose2 = scan.next();
		System.out.println("Ihre Rosenarten lauten: " + rose + " und " + rose2);
		
		scan.close();

	}

}
