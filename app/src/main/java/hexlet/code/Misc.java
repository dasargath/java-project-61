package hexlet.code;

import java.util.Random;

public class Misc {

    public static final int MAX_RAND_BOUND = 100;
    public static final int MIN_RAND_BOUND = 1;

    //randomizer methods for usage in different cases in different classes
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(MIN_RAND_BOUND, MAX_RAND_BOUND);
    }
    public static int getRandomNumber(int lastBound) {
        Random random = new Random();
        return random.nextInt(MIN_RAND_BOUND,  lastBound - 1);
    }
    public static int getRandomNumber(int startBound, int lastBound) {
        Random random = new Random();
        return random.nextInt((lastBound - startBound) + 1) + startBound;
    }

}
