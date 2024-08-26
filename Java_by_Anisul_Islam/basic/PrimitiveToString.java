public class PrimitiveToString {
    public static void main(String[] args) {
        // primitive to string
        int i = 100;
        String str = Integer.toString(i);
        System.out.println("Str = " + str);

        // string to primitive
        String s = "32";
        int j = Integer.parseInt(s);
        System.out.println("j = " + j);
    }
}
