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

        nameList.remove("John");
        isExist(nameList, "John");

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

    private static void isExist(List<String> nameList, String verifiableName) {
        int exist = 0;

        for (String name : nameList) {
            if (name.contains(verifiableName)) exist++;
        }

        if (exist == 0) System.out.println(verifiableName + "is absent in a list");
        else System.out.println(verifiableName + "is present in a list");
    }


}
