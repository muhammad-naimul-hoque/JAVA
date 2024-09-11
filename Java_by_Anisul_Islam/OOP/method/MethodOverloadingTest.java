package method;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading ol1 = new MethodOverloading();
        ol1.add();
        ol1.add(5, 6);
        ol1.add(5.5, 6.5);
        ol1.add(5, 10, 20);

    }
}
