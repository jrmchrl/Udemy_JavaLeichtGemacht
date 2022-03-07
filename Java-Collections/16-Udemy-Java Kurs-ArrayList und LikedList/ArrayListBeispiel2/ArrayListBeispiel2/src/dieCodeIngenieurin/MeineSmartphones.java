package dieCodeIngenieurin;
import DSUebung.*;

public class MeineSmartphones {

    public static void main(String[] args) {

    Smartphone iPhone6 = new Smartphone();

    iPhone6.addKontakt(Kontakt.erstelleKontakt("Lotte", "23435678"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Susanne", "23456734"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Lisaanne", "234567890"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Petra", "34567890"));

    Kontakt petra = new Kontakt("Petra", "34567890");
    iPhone6.addKontakt(petra);

    iPhone6.ausgabe();

    System.out.println("Suchen: ");
    iPhone6.findKontakt("Petra");

    }
    
}
