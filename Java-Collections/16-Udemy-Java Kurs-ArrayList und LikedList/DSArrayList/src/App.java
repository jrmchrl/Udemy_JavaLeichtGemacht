import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // TODO Auto-generated method stub

        /*
        *
        *ArrayList = "Wie ein Array nur dynamisch" 
        *
        * Was sind die Datenstrukturen überhaupt?
        * Dienen zur Zwischenspeicherung von Datenstrukturen
        */

        // EIne ArrayListe erstellen:
        ArrayList einkaufsListe = new ArrayList();
        ArrayList<String> namensListe = new ArrayList<String>();

        // Dateneingabe:
        einkaufsListe.add("Wasser");
        einkaufsListe.add("Brot");
        // einkaufsListe.add(Integer.valueOf(4));

        namensListe.add("Hans");
        namensListe.add("Peter");
        //namensListe.add(Double.valueOf(4.5));


        // Datenausgabe (Mehrere Möglichkeiten)

        for(int i = 0; i< namensListe.size(); i++) {
            System.out.println("Name: " + namensListe.get(i));

        for(String string : namensListe) {
            System.out.println("Die Länge des Namens ist: " + string.length());
        }
    }

}

}
