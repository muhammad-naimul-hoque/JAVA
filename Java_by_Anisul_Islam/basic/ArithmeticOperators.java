import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        System.out.print("Enter num1: ");
        num1 = input.nextInt();
        System.out.print("Enter num2: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("sum: " + result);

        result = num1 - num2;
        System.out.println("subtraction: " + result);

        result = num1 * result;
        System.out.println("multiplication: " + result);

        double results = (double) num1 / num2;
        System.out.println("division: " + results);

        result = num1 % num2;
        System.out.println("modulus: " + result);
    }
}