import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the least number: ");
        int n = input.nextInt();

        // 1+2+3+4+...+n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 1+3+5+...+n
        sum = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 2+4+6+...+n
        sum = 0;
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 1^2+2^2+3^+...+n
        sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "X" + i + " ");
            sum = i * i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 1.5+2.5+3.5+...+n
        double sum2 = 0;
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            sum2 += i;
        }
        System.out.println("\nSum = " + sum2);
        System.out.println();

    }
}