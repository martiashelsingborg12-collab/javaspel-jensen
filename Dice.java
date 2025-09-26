import java.util.Random;

public class Dice {
    private Random rng = new Random();

    public int roll() {
        return rng.nextInt(6) + 1;
    }
}
