/**
 * VariableLengthArgument
 */
public class VariableLengthArgument {

    void add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        VariableLengthArgument v1 = new VariableLengthArgument();
        v1.add(10, 20);
        v1.add(10, 20, 30);
        v1.add(10, 20, 30, 40);
        v1.add(10, 20, 30, 40, 50);
    }
}