import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println(randomNumber);
    }
}
