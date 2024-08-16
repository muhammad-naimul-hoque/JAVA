public class FormetSpecifier {

    public static void main(String[] args) {
        boolean bool = true; // dynamic init
        byte b = 127;
        short s = 32677;
        int i = 1264897;
        long l = 1523456789;
        float f = 10.1f;
        double d = 20.22;

        System.out.printf("boolean = %b\n", bool);
        System.out.printf("b = %d\n", b);
        System.out.printf("s = %d\n", s);
        System.out.printf("i = %d\n", i);
        System.out.printf("l = %d\n", l);
        System.out.printf("f = %.2f\n", f);
        System.out.printf("d = %.3f\n", d);
    }
}