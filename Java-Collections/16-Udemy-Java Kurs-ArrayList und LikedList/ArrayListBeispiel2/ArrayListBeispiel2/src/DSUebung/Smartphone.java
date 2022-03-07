package DSUebung;
import java.util.*;

public class Smartphone {

    //Attribute 

    private List<Kontakt> meineKontakte;

  

    //Konstruktoren

    public Smartphone() {
        meineKontakte = new ArrayList<Kontakt>();
    }

    //Methoden

    public boolean addKontakt(Kontakt neuerKontakt){

        for(Kontakt kontaktInListe : meineKontakte){
        if(neuerKontakt.getName().equals(kontaktInListe.getName())){
            System.out.println("Nicht hinzugefügt. Kontakt vorhanden.");
            return false;
        }
    }
        meineKontakte.add(neuerKontakt);
        System.out.println("Hinzugefügt.");
        return true;
        
    }


    public boolean findKontakt(String name){
        for(Kontakt kontaktInListe : meineKontakte){
            if(name.equals(kontaktInListe.getName())){
                System.out.println("Kontakt vorhanden. " + " Name: " + kontaktInListe.getName() + " Tel: " + kontaktInListe.getTelefonNummer());
                return true;
        }
    }
        System.out.println("Nicht vorhanden.");
        return false;
    }

    public void ausgabe(){
        for (Kontakt kontaktInListe : meineKontakte) {
            System.out.println("Name: " + kontaktInListe.getName() + " Telefonnummer: " + kontaktInListe.getTelefonNummer());
            
        }


    }
}
