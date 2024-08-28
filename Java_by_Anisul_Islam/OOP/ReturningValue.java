//Returning Value from method 
public class ReturningValue {
    int square(int value) {
        return value * value;
    }

    public static void main(String[] args) {
        ReturningValue ob1 = new ReturningValue();
        int result = ob1.square(5);
        System.out.println(result);

        ReturningValue ob2 = new ReturningValue();
        System.out.println("Square of 6 is: " + ob2.square(6));
    }
}
