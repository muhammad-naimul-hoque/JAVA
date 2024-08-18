public class UnaryOparetor {
    public static void main(String[] args) {
        int x = -10;
        int result;

        result = +x;// unary plus
        System.out.println("x: " + result);

        result = -x;// unary minus
        System.out.println("x: " + result);

        // Increment
        int y = 25;
        int z;
        z = y++;// post increment
        System.out.println("z = " + z);
        z = y;
        System.err.println("z = " + z);

        System.err.println();
        z = ++y;// pre increment
        System.out.println("z = " + z);
        z = y;
        System.err.println("z = " + z);
        // Decrement
        System.err.println();
        z = y--;// post increment
        System.out.println("z = " + z);
        z = y;
        System.err.println("z = " + z);

        System.err.println();
        z = --y;// pre increment
        System.out.println("z = " + z);
        z = y;
        System.err.println("z = " + z);
    }
}
/*
 * Unary Oparetor
 * -> Unary plus: +;
 * -> Unary minus: -;
 * -> Increment: ++;
 * --> Prefix Increment: ++a;
 * --> Postfix Increment: a++;
 * -> Decrement: --;
 * --> Prefix Decrement: --a;
 * --> Postfix Decrement: a--;
 */