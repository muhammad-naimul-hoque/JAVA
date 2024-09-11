package final_keyword;

public class University {
    final String UNIVERSITY_NAME = "EDU";
    final int fees; // blank final variable, only init by using constructor.

    static final int advisingFees;

    static {
        advisingFees = 4500;
    }

    University() {
        fees = 25500;
    }

    void display() {
        System.out.println("University Name: " + UNIVERSITY_NAME);
        System.out.println("Fees: " + fees);
        System.out.println("Advising Fees: " + advisingFees);
    }
}
