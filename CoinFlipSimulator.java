import java.util.Random;

public class CoinFlipSimulator {

    public static void main(String[] args) {

        Random random = new Random();

        int flips = 100;
        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= flips; i++) {

            if (random.nextBoolean()) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Total Flips: " + flips);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);

        double headsPercentage = (heads * 100.0) / flips;
        double tailsPercentage = (tails * 100.0) / flips;

        System.out.printf("Heads Percentage: %.2f%%\n", headsPercentage);
        System.out.printf("Tails Percentage: %.2f%%\n", tailsPercentage);
    }
}
