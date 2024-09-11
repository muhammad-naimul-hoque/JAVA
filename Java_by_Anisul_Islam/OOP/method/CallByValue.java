package method;

public class CallByValue {
    void change(int i) {
        i = 20;
    }

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println(x);

        ob.change(x);
        System.out.println(x);

    }
}
