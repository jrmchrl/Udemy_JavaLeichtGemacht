import java.util.Scanner;

public class GoogleKonto {
	
	//Eigenschaften
	private String benutzerName;
	private String Passwort;
	
	//Konstruktor
	
	public GoogleKonto(String benutzerName, String Passwort) {
		this.benutzerName = benutzerName;
		this.Passwort = Passwort;
		
	}
	
	//Methoden

	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}

	public String getPasswort() {
		return Passwort;
	}

	public void setPasswort(String passwort) {
		if(passwort.equals(this.Passwort)) {
			System.out.println("Passwort stimmt geändert werden.");
			System.out.println("Bitte neues PW eingeben");
			Scanner scan = new Scanner(System.in);
			String newPw = scan.nextLine();
			this.Passwort = newPw;
			System.out.println("Das neue Passwort ist " + this.Passwort);
		}else {
			System.out.println("Falsches Passwort");
		}

}
}
