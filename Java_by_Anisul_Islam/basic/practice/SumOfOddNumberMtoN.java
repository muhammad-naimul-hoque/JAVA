
//Assignment 12
import java.util.Scanner;

public class SumOfOddNumberMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.println("Enter M to N value: ");
        int m = input.nextInt();
        int n = input.nextInt();

        System.out.println("M to N Odd number is: ");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
