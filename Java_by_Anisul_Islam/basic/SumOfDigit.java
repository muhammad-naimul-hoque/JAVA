import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, rem, num, temp;
        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}
