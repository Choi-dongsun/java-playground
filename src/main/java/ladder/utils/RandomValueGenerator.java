package ladder.utils;

import java.util.Random;

public class RandomValueGenerator {
    private static Random rnd = new Random();

    public static boolean generateRandomValue() {
        return rnd.nextBoolean();
    }
}
