package homework2;

/**
 * Created by Oleksandr.Lokhtin on 21-Nov-17.
 */
public class WorkWithStrings {
    public static void main(String[] args) {
        String str = "Hello World! ";

        System.out.println(str.charAt(2));
        System.out.println(str.concat("Yes!"));
        System.out.println(str.endsWith("d! "));
        System.out.println(str.equals("hello world! "));
        System.out.println(str.equalsIgnoreCase("hello world! "));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("Wo"));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.length());
        System.out.println(str.replace('e','T'));
        String[] strArray = str.split(" ");
        System.out.println(str.startsWith("e"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 5));
        char[] chArray = str.toCharArray();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
    }
}
