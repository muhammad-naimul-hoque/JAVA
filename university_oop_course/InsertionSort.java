/**
 * Insertion Sort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] ara = { 43, 31, 26, 29, 12 };
        System.out.print("Before insertion sort: ");
        for (int x : ara) {
            System.out.print(x + " ");
        }

        for (int i = 1; i < ara.length; i++) {
            int temp = ara[i];
            int j = i - 1;

            while (j >= 0 && ara[j] > temp) {
                ara[j + 1] = ara[j];
                j--;
            }
            ara[j + 1] = temp;
        }
        System.out.println();

        System.out.print("After insertion sort: ");
        for (int x : ara) {
            System.out.print(x + " ");
        }
    }
}