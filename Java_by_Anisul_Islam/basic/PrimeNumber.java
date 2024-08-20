import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Positive number: ");
        int num = input.nextInt();
        boolean isPrime = false;

        if (num == 0 || num == 1) {
            System.out.println("Not prime number");
            return;
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % 2 == 0) {
                    isPrime = true;
                    break;
                }
            }
        }

        if (isPrime == false) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
