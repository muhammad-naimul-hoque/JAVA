public class StringPalindrome {
    public static void main(String[] args) {
        String str1 = "madam";
        StringBuffer sb = new StringBuffer(str1);
        String str2 = sb.reverse().toString();

        if (str1.equals(str2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
