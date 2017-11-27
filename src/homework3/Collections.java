package homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr.Lokhtin on 27-Nov-17.
 */
public class Collections {

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
