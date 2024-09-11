package method;

public class StaticBlock {
    static int id;
    static String name;

    static {
        id = 101;
        name = "Naimul";
    }

    static void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    static { // static block will execute before main method.
        System.out.println("static block.");
    }

    public static void main(String[] args) {// main method will execute after static block.
        System.out.println("main method.");
        StaticBlock.display();
    }
}
