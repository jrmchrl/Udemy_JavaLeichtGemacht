import java.util.LinkedList;


public class DSLinkedList{

public static void main(String[] args) {

        // Datenstruktur erstellen 
        LinkedList<Integer> liste = new LinkedList<Integer>();

        //Dateneingaben 
        for(int i = 0; i < 10000000; i++) {
            liste.add(i);

        }

        // Zeit messen
        final long timeStart = System.currentTimeMillis();
        DSLinkedList.getZahl(1999999, liste);
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Das Suchen hat gedauert: " + (timeEnd - timeStart) + "Millisek. ");

    }

    // get - Methode
    public static void getZahl(int index, LinkedList<Integer> liste){
        System.out.println(liste.get(index));

    }
}