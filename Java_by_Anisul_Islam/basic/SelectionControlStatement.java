import java.util.Scanner;

public class SelectionControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
