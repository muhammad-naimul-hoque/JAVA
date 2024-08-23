/**
 * ForEachLoop
 */
public class ForEachLoop {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 100 };
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}