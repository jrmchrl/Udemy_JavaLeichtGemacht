
public class GalaxyJ3 extends Samsung implements ITelefon {

	//Eigenschaften
	//Konstruktor
	public GalaxyJ3(double preis, String produktTyp) {
		super(preis,produktTyp);
		
	}
	
	//Methoden	
	@Override
	public void powerOn() {
		System.out.println("Das GalaxyS3 geht an der rechten Seite an und man muss den Power Button 3 Sekunden halten.");
		
	}

	@Override
	public boolean esKlingelt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anrufen() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
