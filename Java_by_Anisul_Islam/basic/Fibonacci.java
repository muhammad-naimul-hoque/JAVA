
/**
 * Fibonacci without recursion
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many number: ");
        int n = input.nextInt();
        int first = 0, second = 1, fibo;

        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            System.err.print(" " + fibo);
            first = second;
            second = fibo;
        }

    }
}