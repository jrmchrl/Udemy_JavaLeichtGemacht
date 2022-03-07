import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adresse peterAdresse = new Adresse("Peter", "Loebenhauern 4", "Berlin");
		Adresse charlotteAdresse = new Adresse("Charlotte","Kartograk 5", "Leipzig");
		Adresse sibilleAdresse = new Adresse("Sibille","Artenkorp 4", "Wien");

		// Datenstrukturen
		ArrayList<Adresse> adressenListe = new ArrayList<Adresse>(); //Dynamisch
		Adresse[] adressenArray = {peterAdresse,charlotteAdresse,sibilleAdresse}; //Statisch
		
		// Eingabe in Liste
		adressenListe.add(peterAdresse);
		adressenListe.add(charlotteAdresse);
		adressenListe.add(sibilleAdresse);
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String straße = scanner.nextLine();
		String stadt = scanner.nextLine();
		
		Adresse adresse4 = new Adresse(name, straße, stadt);
		adressenListe.add(adresse4);
		
		adressenArray[3] = adresse4; //wirft Exception, weil statisches Array nicht zur Laufzeit erweitert werden kann
		
		System.out.println("ArrayList");
		// Ausgabe der Liste
		for (Adresse adresse : adressenListe) {
			System.out.println("Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
		}
		
		System.out.println("Array");
		for (Adresse adresse : adressenArray) {
			System.out.println("Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
		}
		}
	}


