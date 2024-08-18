import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        int large = (number1 > number2) ? number1 : number2;
        System.out.println("Large number: " + large);
    }
}