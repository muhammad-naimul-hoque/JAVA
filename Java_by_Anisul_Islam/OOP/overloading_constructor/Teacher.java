package overloading_constructor;

/**
 * Teacher
 */
public class Teacher {
    String name, gender;
    int phone;

    Teacher() {
        System.out.println("no info.");
        System.out.println();
    }

    Teacher(String nam, String gen) {
        name = nam;
        gender = gen;
    }

    Teacher(String nam, String gen, int phon) {
        name = nam;
        gender = gen;
        phone = phon;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}