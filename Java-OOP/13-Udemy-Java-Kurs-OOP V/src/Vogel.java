
public class Vogel extends Tier {
	
	//Multiple-inheritance does not exist in Java

	public Vogel() {
		super(null, 0, 0);
		
	}

	@Override
	public void essen() {
		System.out.println("Der Vogel pickt sein essen auf.");
		
	}

	@Override
	public void atmen() {
		System.out.println("Der Vogel atmet über ");
		
		
	}
	

}
