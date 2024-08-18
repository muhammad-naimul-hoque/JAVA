import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter intial number: ");
        int m = input.nextInt();
        System.out.print("Enter final number: ");
        int n = input.nextInt();
        System.out.println();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println("\n");
        }
    }
}
