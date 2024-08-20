import java.util.Scanner;

public class PrimeNumberV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        int m = input.nextInt();
        System.err.print("Enter Final value: ");
        int n = input.nextInt();
        int totalPrime = 0;
        boolean isPrime = false;

        System.out.print("Prime Number " + m + "to " + n + " is: ");
        for (int i = m; i <= n; i++) {// m = 3 ,n = 7, -> i = 3, i <= 6
            for (int j = 2; j < i - 1; j++) {// i = 3, j = 2 , j < i-1 = 2
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime == false) {
                System.out.print(i + " ");
                totalPrime++;
            }
            isPrime = false;
        }
        System.out.print("Total Prime number is: " + totalPrime);
    }
}
