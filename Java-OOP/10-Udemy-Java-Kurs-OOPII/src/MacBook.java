
public class MacBook extends Laptop {
	
	//Eigenschaften
	boolean touchBar;
	
	//Konstruktoren
	public MacBook(String marke, String cpu, int ram, double preis, boolean touchBar)
	{
		super(marke,cpu,ram,preis);
		this.touchBar = touchBar;
		
	}

	
	//Methoden
	@Override
	public void starten() {
		super.starten();
		System.out.println("MacBook startet.");
	}

}
