
public class Kuh extends Tier {
	
	//Eigenschaften
	//von Superklasse
	int hufe; 
	
	
	
	//Konstruktoren
	public Kuh(String name, int groeße, int gewicht, int hufe) {
		super(name, groeße, gewicht);
		this.hufe = hufe;
	}


	//Methoden
	//von Superklasse
	@Override
	public void essen() {
		// TODO Auto-generated method stub
		super.essen();
		System.out.println("Die Kuh muss das Essen immer wiederkäuen");
	 
	}
	
	
	

}
