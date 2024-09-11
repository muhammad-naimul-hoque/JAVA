/**
 * Recursion
 */
public class Recursion {

    int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Recursion ob = new Recursion();
        int result = ob.factorial(5);

        System.out.println(result);
    }
}