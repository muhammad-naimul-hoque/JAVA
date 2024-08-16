import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = 0.56 * (fahrenheit - 32);
        System.err.println("Celsius: " + celsius);
    }
}
