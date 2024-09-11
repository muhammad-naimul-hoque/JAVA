
/**
 * Write a Java program to find the transpose of a given matrix.
 */
import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns:");
        int col = input.nextInt();

        int[][] givenMatrix = new int[row][col];
        int[][] transposeMatrix = new int[col][row];

        // getting input
        System.out.println("Enter Your Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                givenMatrix[i][j] = input.nextInt();
            }
        }
        System.out.println();

        // given matrix output
        System.out.println("Given Matrix is: ");
        for (int i = 0; i < row; i++) {
            System.out.print("\t");
            for (int j = 0; j < col; j++) {
                System.out.print(givenMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // creating transpose matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeMatrix[j][i] = givenMatrix[i][j];
            }
        }

        // output of transpose martrix
        System.out.println("Transpose Matrix is: ");
        for (int i = 0; i < col; i++) {
            System.out.print("\t");
            for (int j = 0; j < row; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}