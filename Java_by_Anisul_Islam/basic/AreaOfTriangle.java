import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height, area;

        System.out.print("Enter the base: ");
        base = input.nextDouble();
        System.out.print("Enter the height: ");
        height = input.nextDouble();

        area = 0.5 * base * height;
        System.err.println("\nArea = " + area);
    }
}
