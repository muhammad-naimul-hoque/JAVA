
//Assignment 9
import java.util.Scanner;

public class LanguageSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("1. Bengali\n2.Hindi\n3.Urdu\ndefault: English");
        System.err.print("Enter Option Number: ");

        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Selected language is Bengali");
                break;
            case 2:
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.err.println("Selected language is Urdu");
                break;

            default:
                System.err.println("Selected language is English");

        }
    }
}
/*
 * // switch assignment: call center
 * // if user select option 1 then set language bengali
 * // if user select option 2 then set language hindi
 * // if user select option 3 then set language urdu
 * // for any other option set language english
 * public class Assignment9 {
 * public static void main(String[] args) {
 * // get the OPTION from user
 * // use switch, case, break and default
 * 
 * // Selected language is Bengali
 * // Selected language is Hindi
 * // Selected language is Urdu
 * 
 */
