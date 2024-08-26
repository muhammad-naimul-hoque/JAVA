import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);

        System.out.println("Before Sort: " + number);

        Collections.sort(number);
        System.out.println("After Ascending Sort: " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After Descending Sort: " + number);

    }
}
