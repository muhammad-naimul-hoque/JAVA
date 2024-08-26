public class Wrapper {
    public static void main(String[] args) {
        // primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x; // auto boxing
        System.out.println("z = " + z);

        // object to primitive
        Double d = new Double(10.25);
        System.out.println("d = " + d);
        double e = d;// d.doubleValue() unboxing
        System.out.println("e = " + d);
    }
}
