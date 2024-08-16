
//Assignmet 7
import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.err.println("You are a JAVA lover.");
        } else if (ch == 'n' || ch == 'N') {
            System.err.println("You are not a JAVA lover");
        }
    }
}
// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
