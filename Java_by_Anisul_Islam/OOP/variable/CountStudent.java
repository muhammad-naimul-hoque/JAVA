package variable;

public class CountStudent {
    // int count = 0; non static variable
    static int count = 0; // static variable

    CountStudent() {
        count++;
    }

    void displayInfo() {
        System.out.println("Total student = " + count);
    }
}
