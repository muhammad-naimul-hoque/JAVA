package classObject;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1;// object declare
        teacher1 = new Teacher("Master Shifu", "Male", 123456789);// object create
        Teacher teacher2 = new Teacher("Master Oogway", "Male", 213456789);

        // teacher1.setInfo("Master Shifu", "Male", 123456789);
        teacher1.displayInfo();

        // teacher2.setInfo("Master Oogway", "Male", 213456789);
        teacher2.displayInfo();

        Teacher teacher3 = new Teacher();
        teacher3.displayInfo();

    }
}
