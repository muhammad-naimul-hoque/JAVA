package variable;

public class Student {
    String name;
    int id;
    static String universityName = "EDU";

    Student(String nam, int i) {
        name = nam;
        id = i;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + universityName);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Naimul", 3222);
        Student student2 = new Student("Pritom", 3230);

        student1.displayInformation();
        student2.displayInformation();
    }
}
