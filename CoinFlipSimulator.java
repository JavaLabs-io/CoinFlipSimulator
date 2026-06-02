import java.util.Random;

public class CoinFlipSimulator {

    public static void main(String[] args) {

        Random random = new Random();

        String result = random.nextBoolean() ? "Heads" : "Tails";

        System.out.println("Coin landed on: " + result);
    }
}
