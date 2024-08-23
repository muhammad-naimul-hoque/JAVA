public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int size = numbers.length;
        System.out.println("Array size: " + size);

        numbers[0] = 10;
        numbers[1] = 10;
        numbers[2] = 10;
        numbers[3] = 10;
        numbers[4] = 10;
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("Sum = " + sum);
    }
}
