import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        System.out.println("Size = " + number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        // System.out.println(number);
        System.out.println("Using For each Loop");
        for (int x : number) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Size = " + number.size());

        System.out.println("Using Iterator");
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println("ArrayList Contain: " + number);

        // Removing Item from array list
        number.remove(2);
        System.out.println("After remove ArrayList Contain: " + number);

        // Replace method
        number.set(2, 30);
        System.out.println("After replace ArrayList Contain: " + number);

        // Removing All Item from array list
        /*
         * number.removeAll(number);
         * System.out.println("After remove all ArrayList Contain: " + number);
         */
        // Contains method
        boolean contain = number.contains(30);
        System.out.println("30 is in the list: " + contain);

        // Get method
        int x = number.get(0);
        System.out.println("index 0 = " + x);

        // IndexOf method
        int position = number.indexOf(30);
        System.out.println("The index of 30 is: " + position);

        // Clear method
        number.clear();
        System.out.println("After clear ArrayList Contain: " + number);

        // isEmpty method
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty: " + check);
    }
}
