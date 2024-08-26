public class String1 {
    public static void main(String[] args) {
        String str1 = "naimul Hoque";
        String str2 = new String("Naimul Hoque");
        char[] str3 = { 'N', 'a', 'i', 'm', 'u', 'l' };

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println(str3);

        int length1 = str1.length();
        System.out.println("Length of str1: " + length1);

        // equals(), equalsIgnoreCase method
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equals.");
        } else {
            System.out.println("Not equal.");
        }

        // contains() method
        boolean contain = str1.contains("Hoque");
        System.out.println("str1 contain: " + contain);

        // isEmpty() method
        boolean empty = str1.isEmpty();
        System.out.println("Str1 is empty: " + empty);
    }
}
