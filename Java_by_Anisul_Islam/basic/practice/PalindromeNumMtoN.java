
//Assignment 14
import java.util.Scanner;

public class PalindromeNumMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int reverse, rem, m, n, count = 0, originalNum, temp;
        System.out.print("Enter the Value of M: ");
        m = input.nextInt();
        System.out.print("Enter the Value of N: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            originalNum = i;
            reverse = 0;
            temp = originalNum;
            while (temp != 0) {
                rem = temp % 10;
                reverse = reverse * 10 + rem;
                temp /= 10;
            }

            if (originalNum == reverse) {
                System.out.print(originalNum + " ");
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}
