
//Assignmet 15
import java.util.Scanner;

public class ArmstrongNumMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.err.print("Enter initial value: ");
        int m = input.nextInt();
        System.out.print("Enter final value: ");
        int n = input.nextInt();

        int originalNum, temp, reminder, reverseNum, count = 0;
        System.out.print("Armstrong Number: ");
        for (int i = m; i <= n; i++) {
            originalNum = i;
            temp = originalNum;
            reverseNum = 0;
            while (temp != 0) {
                reminder = temp % 10;
                reverseNum += reminder * reminder * reminder;
                temp /= 10;
            }

            if (originalNum == reverseNum) {
                System.out.print(originalNum + " ");
                count++;
            }
        }
        System.out.println("\nCount = " + count);
    }
}
