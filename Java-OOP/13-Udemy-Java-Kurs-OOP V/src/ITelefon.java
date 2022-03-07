
public interface ITelefon {
	// Interface ermöglicht so eine Art Mehrfachvererbung. In Java nicht möglich, aber eben durch Interfaces. Es kann beliebig viele geben, die dann durch konkrete Klassen impelmentiert werden.
	//Interface Name der Klasse beginnt immer mit I; Interfaces haben keine Objekte
	//Interface beschreibt was getan werden soll, aber nicht wie. (=Logik der abstrakten Klassen) 
	//In Interface sind Methoden automatisch abstrakt
	//EIgenschaften/ Attribute --> nur Konstanten
	
	public static final String NETZANBIETER = "Telekom"; //final = Wert kann nicht mehr geändert werden
	
	//Methodensignaturen /Methodenköpfe
	public void powerOn();
	public boolean esKlingelt();
	public boolean anrufen();
	
	
}
