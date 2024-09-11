package encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Naimul");
        System.out.println(person1.getName());

        person1.setAge(24);
        System.out.println(person1.getAge());
        // person1.age = 24;
        // person1.display();
    }
}
