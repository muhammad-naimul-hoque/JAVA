package inheritance.instance_of_operator;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Person person = new Person();
        Teacher teacher = new Teacher();

        System.out.println("Animal is a Animal: " + (animal instanceof Animal));
        System.out.println("Person is a  Animal: " + (person instanceof Animal));
        System.out.println("Teacher is a Animal: " + (teacher instanceof Person));
        System.out.println("Teacher is a Animal: " + (teacher instanceof Animal));
        System.out.println("Person is a Teacher: " + (person instanceof Teacher));
    }
}
