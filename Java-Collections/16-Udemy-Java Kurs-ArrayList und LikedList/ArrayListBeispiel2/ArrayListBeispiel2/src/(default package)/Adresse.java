public class Adresse {

    //Eigenschaften / Attribute

    private String name;
    private String straße;
    private String stadt;

    
    //Konstruktor 
    public Adresse(String name, String straße, String stadt) {
        super(); //ruft immer die Methoden der Klasse Objekt an - die Mutter aller Objekte
        this.name = name;
        this.straße = straße;
        this.stadt = stadt;
    }
  

    //Methoden

    public String getName() {
        return name;
    }
    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }
    public String getStraße() {
        return straße;
    }
    
    public void setStraße(String straße) {
        this.straße = straße;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}