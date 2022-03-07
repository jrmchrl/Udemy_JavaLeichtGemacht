import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortedSetList {
    
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        // ArrayList

        list1.add("Kera");
        list1.add("Susanne");
        list1.add("Isa");
        list1.add("Lisa");
        list1.add("Charlotte");
        list1.add("Paula");
        list1.add("Berta");

        for (String string : list1) {
            System.out.println(string);
        }

        Collections.sort(list1);

        System.out.println("\n Sortiert");
        for (String string : list1) {
            System.out.println(string);
        }

        Set<String> set1 = new HashSet<String>();

        set1.add("Kera");
        set1.add("Susanne");
        set1.add("Isa");
        set1.add("Lisa");
        list1.add("Charlotte");
        list1.add("Paula");
        list1.add("Berta");
        
    }
}