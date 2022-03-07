import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Wichtiger Unterschied zu list
        //In einem Set kann kein Element doppelt vorkommen da jedes Element einzigartig gilt

            // Klassen die ein Set realisieren
            // 1. TreeSet
            // 2. HashSet
            // 3. LinkedHashSet

        // Datenstruktur erzeugen
        List<String> list1 = new ArrayList<String>();

        Set<String> set1 = new TreeSet<String>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new LinkedHashSet<String>();

        // Dateneingabe
        list1.add("Kera");
        list1.add("Susanne");
        list1.add("Isa");
        list1.add("Lisa");
        list1.add("Charlotte");
        list1.add("Paula");
        list1.add("Berta");

        // TreeSet
        set1.add("Kera");
        set1.add("Susanne");
        set1.add("Isa");
        set1.add("Lisa");
        set1.add("Charlotte");
        set1.add("Paula");
        set1.add("Berta");

        // HashSet
        set2.add("Kera");
        set2.add("Susanne");
        set2.add("Isa");
        set2.add("Lisa");
        set2.add("Charlotte");
        set2.add("Paula");
        set2.add("Berta");

        // LinkedHashSet
        set3.add("Kera");
        set3.add("Susanne");
        set3.add("Isa");
        set3.add("Lisa");
        set3.add("Charlotte");
        set3.add("Paula");
        set3.add("Berta");

        // Dateneingabe
        System.out.println("Ausgabe Arraylist: ");
        Main.getElement(list1);
        System.out.println("\n Ausgabe TreeSet: ");
        Main.getElement(set1);
        System.out.println("\n Ausgabe HashSet: ");
        Main.getElement(set2);
        System.out.println("\n Ausgabe LinkedHashSet: ");
        Main.getElement(set3);
        
    }

    public static void getElement(Collection<String> collection){
        for (String string : collection) {
            System.out.println(string);
            
        }
    }
}