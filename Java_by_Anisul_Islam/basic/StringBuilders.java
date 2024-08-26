/**
 * StringBuilders
 */
public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Naimul");
        str.append(" Hoque");
        System.out.println(str);

        str.delete(7, 12);
        System.out.println(str);
    }
}