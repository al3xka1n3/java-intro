import classwork3.Person;

public class HelloWorld {
    public static void main(String[] args)  {

        Person person1 = new Person(18, "Alex");
        Person person2 = new Person(20, "Jack");
        Person person3 = new Person(20, "Jack");

        try {
            int num = 3/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        //System.out.println(person1.equals(person3));
        //System.out.println(person2.equals(person3));

        //System.out.println("Hello World");
    }
}
