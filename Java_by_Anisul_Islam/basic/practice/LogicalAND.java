
//Assignmet 8
import java.util.Scanner;

public class LogicalAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Have you completed your masters? y/n: ");
        char ch1 = input.next().charAt(0);
        System.out.print("Are you fluent in English? y/n: ");
        char ch2 = input.next().charAt(0);

        if (ch1 == 'y' && ch2 == 'y') {
            System.err.println("You are eligible to for the job interview.");
        } else {
            System.err.println("You are not eligible to for the job interview.");
        }
    }
}
// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n
// Step 2: Ask the candidate are you fulent in English? y/n
// Step 3: if the candidate has passed masters and also have fluent english
// skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview
