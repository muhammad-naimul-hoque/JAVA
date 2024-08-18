//Assignment 10
// find sum of 1-10 using for loop

public class SumUsingForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("i = " + i + " " + "sum = " + sum);
        }

        System.out.println("Final Sum is = " + sum);
    }
}
