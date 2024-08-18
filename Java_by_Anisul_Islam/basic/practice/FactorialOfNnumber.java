
//Assignment 11
import java.util.Scanner;

public class FactorialOfNnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
