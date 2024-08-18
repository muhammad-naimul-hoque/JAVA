public class JumpControlStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
