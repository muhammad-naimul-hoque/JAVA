import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] number = { 10, -3, 15, 5, 18 };

        Arrays.sort(number);
        System.out.print("Ascending: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + number[i]);
        }

        System.out.println();
        System.out.print("Descending");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }

        System.out.println();

        String[] name = { "Naim", "Sumi", "Raiyan", "Wasifa" };
        Arrays.sort(name);
        for (int i = 0; i < 4; i++) {
            System.out.print(name[i] + " ");
        }

        for (int i = 3; i >= 0; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
