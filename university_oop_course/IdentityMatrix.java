
/**
 * Write a Java program to determine whether a given matrix is an identity
 * matrix.
 */
import java.util.Scanner;

public class IdentityMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns:");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        boolean bool = true;

        if (row != col) {
            System.out.println("Matrix should be a square matrix");
            return;
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Enter the value of matrix[" + i + "][" + j + "] = ");
                    matrix[i][j] = input.nextInt();
                }
            }

            System.out.println("Matrix is: ");
            for (int i = 0; i < row; i++) {
                System.out.print("\t");
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        bool = false;
                        break;
                    }
                    if (i != j && matrix[i][j] != 0) {
                        bool = false;
                        break;
                    }
                }
            }
        }
        if (bool) {
            System.out.println("Identity Matrix!");
        } else {
            System.out.println("Not Identity Matrix!");
        }
    }
}