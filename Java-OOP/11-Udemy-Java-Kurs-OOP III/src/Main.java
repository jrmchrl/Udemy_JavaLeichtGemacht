
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Computer computer1 = new Computer();
//		System.out.println(computer1.mainboard);
//		
//		Mainboard board1 = new Mainboard();
//		System.out.println("board1");
//		
//		computer1.mainboard = board1;
//		System.out.println("computer1.mainboard");
		
//		Mainboard bd2 = new Mainboard();
//		Computer cp2 = new Computer("Intel", bd2, 500);
		
//		Mainboard mainboardAsus = new Mainboard(4,2,4);
//		Computer computerPeter = new Computer("Intel", mainboardAsus, 400);
//		System.out.println(computerPeter.mainboard.usbPorts);

		
		//Objekt in Objekt - Objekt Mainboard in Objekt Computer
		Computer computerOlga = new Computer(2,1,2,"AMD");
		System.out.println(computerOlga.mainboard.ramSlots);

	}

}
