import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        double[] number = new double[5];

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter 5 number: ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += number[i];
        }

        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + sum / number.length);

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            } else if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
