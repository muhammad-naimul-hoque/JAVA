/**
 * Selection Sort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int ara[] = { 9, 13, 15, 11, 2 };
        System.out.print("Before selection sort: ");
        for (int i : ara) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < ara.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ara.length; j++) {
                if (ara[j] < ara[min]) {
                    min = j;
                }

            }
            if (min != i) {
                int temp = ara[i];
                ara[i] = ara[min];
                ara[min] = temp;
            }
        }
        System.out.println();

        System.out.print("After selection sort: ");
        for (int i : ara) {
            System.out.print(i + " ");
        }
    }
}