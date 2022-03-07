import java.util.*;
import java.util.Scanner;

public class Adressbuch {

    public static void main(String[] args) {

        Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.3", "Berlin");
        Adresse hansAdresse = new Adresse("Hans", "Huberli 4", "Leipzig");
        Adresse charlotteAdresse = new Adresse("Charlotte", "Libelo 4", "Hamburg");

        ArrayList<Adresse> adressenListe = new ArrayList<Adresse>(); // Dynamisch (erweitert sich zur Laufzeit)
        Adresse [] adressenArray = {peterAdresse, hansAdresse, charlotteAdresse}; // Statisch (fixe Größe während Programmierung festgelegt)

        // Eingabe in Liste
        adressenListe.add(peterAdresse);
        adressenListe.add(hansAdresse);
        adressenListe.add(charlotteAdresse);

        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        String straße  = scanner.nextLine();
        String stadt  = scanner.nextLine();

        Adresse adresse4 = new Adresse(name, straße, stadt);
        adressenListe.add(adresse4);

      

        // Ausgabe der Listen
        for (Adresse adresse : adressenListe) {
            System.out.println("Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
        }

        System.out.println("ArrayList");
        for (Adresse adresse : adressenArray) {
            System.out.println("Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
                }

    }
    
}
