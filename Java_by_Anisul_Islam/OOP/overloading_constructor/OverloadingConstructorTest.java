package overloading_constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Teacher teacher1 = new Teacher("Master Shifu", "male");
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher("Master Oogway", "male", 213456789);
        teacher2.displayInfo();

    }
}
