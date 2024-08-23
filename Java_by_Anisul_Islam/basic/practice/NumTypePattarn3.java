
//Assignment 17
import java.util.Scanner;

public class NumTypePattarn3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many line: ");
        int num = input.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if (col % 2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
