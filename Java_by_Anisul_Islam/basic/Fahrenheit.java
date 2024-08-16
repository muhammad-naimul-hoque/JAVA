import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = 1.8 * celsius + 32;
        System.err.println("Farenhite = " + fahrenheit);
    }
}
