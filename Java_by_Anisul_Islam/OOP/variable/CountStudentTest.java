package variable;

public class CountStudentTest {
    public static void main(String[] args) {
        CountStudent student1 = new CountStudent();
        student1.displayInfo();

        CountStudent student2 = new CountStudent();
        student2.displayInfo();

        CountStudent student3 = new CountStudent();
        student3.displayInfo();
    }
}

/*
 * Non static variable is related to object; so count value differently count.
 * Static variable is related Class; so count value add.
 */
