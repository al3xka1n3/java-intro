package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleksandr.Lokhtin on 27-Nov-17.
 */
public class NameCollection {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>() {{
            add("Jack");
            add("John");
            add("Maria");
            add("Alex");
            add("Anna");
            add("Oleg");
        }};

        String nameToDelete = "John";
        nameList.remove(nameToDelete);

        if(!nameList.contains(nameToDelete)) {
            System.out.println(nameToDelete + " is absent in a list");
        } else {
            System.out.println(nameToDelete + " is present in a list");
        }

        Iterator<String> iteratorBeforeSort = nameList.iterator();
        System.out.println("Before sorting: ");
        while (iteratorBeforeSort.hasNext()) {
            System.out.println(iteratorBeforeSort.next());
        }
        System.out.println("\n");

        Collections.sort(nameList);
        Iterator<String> iteratorAfterSort = nameList.iterator();
        System.out.println("After sorting: ");
        while (iteratorAfterSort.hasNext()) {
            System.out.println(iteratorAfterSort.next());
        }
    }
}
