import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int factorial = 1;

        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factoral of " + num + " is: " + factorial);
    }
}
