public class NumberConversion {
    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("binary to decimal = " + decimal);

        String octal = "675";
        decimal = Integer.parseInt(octal, 8);
        System.out.println("decimal to octal = " + decimal);

        String hexadecimal = "A";
        decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("hexadecimal to decimal = " + decimal);

        // decimal to other types conversion
        int decimalValue = 15;
        String binaryValue = Integer.toBinaryString(decimalValue);
        System.out.println("decimal to binary = " + binaryValue);

        String octalValue = Integer.toOctalString(decimalValue);
        System.out.println("decimal to octal = " + octalValue);

        String hexadecimalValue = Integer.toHexString(decimalValue);
        System.out.println("decimal to hexadecimal = " + hexadecimalValue);
    }
}
