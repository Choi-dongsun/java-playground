package racingcar.utils;

import java.util.Random;

public class RandomValueGenerator {
    public static int generateRandonNum() {
        Random rnd = new Random();
        return rnd.nextInt(10);
    }
}
