
public class MathClass {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println("Max = " + Math.max(x, y));
        System.out.println("Min = " + Math.min(x, y));

        int z = -30;
        System.out.println("Absolute of z is: " + Math.abs(z));

        System.out.println("Power: " + Math.pow(x, y));
        System.out.println("Round of 8.5 to 8.9: " + Math.round(8.5f));
        System.out.println("Round of 8.1 ot 8.4: " + Math.round(8.4f));
        System.out.println("PI: " + Math.PI);
    }
}
