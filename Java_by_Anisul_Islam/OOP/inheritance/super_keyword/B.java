package inheritance.super_keyword;

public class B extends A {
    int x = 5;

    void display() {
        System.out.println(super.x);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Inside B method.");
    }
}
