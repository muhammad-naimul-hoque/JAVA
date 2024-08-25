import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumOfDiagonalElement = 0;
        int sumOfUpperElement = 0;
        int sumOfLowerElement = 0;

        // getting Input for A matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        // diagonal, upper, lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonalElement += A[row][col];
                }
                if (row < col) {
                    sumOfUpperElement += A[row][col];
                }
                if (row > col) {
                    sumOfLowerElement += A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonal elements: " + sumOfDiagonalElement);
        System.out.println("Sum of Upper Element: " + sumOfUpperElement);
        System.out.println("Sum of Lower Element: " + sumOfLowerElement);
    }
}
