
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int reverse = 0, rem, num, temp;
        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }

        if (num == reverse) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("No Plaindrome.");
        }
    }
}