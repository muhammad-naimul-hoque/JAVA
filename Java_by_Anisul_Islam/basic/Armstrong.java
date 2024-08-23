import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int temp = num;
        int remainder, reverseNum = 0;

        while (temp != 0) {
            remainder = temp % 10;
            reverseNum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (num == reverseNum) {
            System.out.println(num + " is Armstrong Number.");
        } else {
            System.out.println("Not Armstrong.");
        }
    }
}
