package homework2;

/**
 * Created by Oleksandr.Lokhtin on 21-Nov-17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbers(10);
    }

    private static void printFibonacciNumbers(int quantity) {
        int n1 = 0;
        int n2 = 1;
        if (quantity == 1){
            System.out.println(n1);
        } else if (quantity == 2){
            System.out.println(n1);
            System.out.println(n2);
        } else if (quantity >= 3){
            System.out.println(n1);
            System.out.println(n2);
            for (int i = 0; i < quantity-2; i++) {
                int temp = n2;
                n2 = n2 + n1;
                n1 = temp;
                System.out.println(n2);
            }
        }
    }
}
