public class Test {

    public static void main(String[] args) {
        int m = 100; // Start of range
        int n = 200; // End of range

        System.out.println("Palindromes between " + m + " and " + n + ":");

        // Loop through the range m to n
        for (int i = m; i <= n; i++) {
            int originalNumber = i;
            int reversedNumber = 0;
            int temp = originalNumber;

            // Reverse the number
            while (temp != 0) {
                int remainder = temp % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                temp /= 10;
            }

            // Check if the original number is equal to its reversed version
            if (originalNumber == reversedNumber) {
                System.out.print(originalNumber + " ");
            }
        }
    }

}
