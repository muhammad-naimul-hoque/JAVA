/**
 * Class and Object
 */
package classObject;

public class Teacher {
    String name, gender;
    int phone;

    Teacher() { // Default Constructor
        System.out.println("No value");
    }

    Teacher(String nam, String gen, int ph) { // Parametrized Constructor
        name = nam;
        gender = gen;
        phone = ph;
    }

    /*
     * void setInfo(String na, String gen, int ph) {
     * name = na;
     * gender = gen;
     * phone = ph;
     * }
     */
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println();
    }
}