package inheritance.method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Naim";
        teacher.age = 24;
        teacher.qualification = "BSc in CSE";
        teacher.displayInformation();

        Person person = new Person();
        person.name = "Hoq";
        person.age = 21;
        person.displayInformation();
    }
}
