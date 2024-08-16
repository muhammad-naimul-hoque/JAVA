
//Assignment 6
import java.util.Scanner;

public class DigitSpelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any digit 0-9: ");
        int digit = input.nextInt();

        if (digit == 1) {
            System.out.println("One");
        } else if (digit == 2) {
            System.err.println("Two");
        } else if (digit == 3) {
            System.err.println("Three");
        } else if (digit == 4) {
            System.err.println("Four");
        } else if (digit == 5) {
            System.err.println("Five");
        } else if (digit == 6) {
            System.err.println("Six");
        } else if (digit == 7) {
            System.err.println("Seven");
        } else if (digit == 8) {
            System.err.println("Eight");
        } else if (digit == 9) {
            System.err.println("Nine");
        } else {
            System.out.println("Zero");
        }
    }
}
/*
 * Digit spelling program using if,else if, else
 * step 1: ask for a digit between 0-9
 * step 2: check the digit and print it by spelling. example if user input is 0
 * then print Zero
 * step 3: if the digit is not among 0-9 then print Invalid digit
 */
