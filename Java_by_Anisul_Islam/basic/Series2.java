import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the least number: ");
        int n = input.nextInt();

        // 1*2*3*4*...*n
        int sum = 1;
        System.out.println("S1: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum *= i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // s1= 1*3*5*...*n
        sum = 1;
        System.out.println("S2: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum *= i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // s2= 2*4*6*...*n
        sum = 1;
        System.out.println("S3: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            sum *= i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 1^2*2^2*3^2*...*n
        sum = 1;
        System.out.println("S4: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "X" + i + " ");
            sum *= i * i;
        }
        System.out.println("\nSum = " + sum);
        System.out.println();

        // 1.5*2.5*3.5*...*n
        double sum2 = 1;
        System.out.println("S5: ");
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            sum2 *= i;
        }
        System.out.println("\nSum = " + sum2);
        System.out.println();

    }
}