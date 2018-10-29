package ladder.domain;

import ladder.dto.LadderGameDto;
import ladder.utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private List<List<Boolean>> ladder = new ArrayList<>();
    private List<Boolean> points;

    private LadderGame(int userNum) {
        points = generateLine(userNum - 1);
        ladder.add(points);
    }

    public List<Boolean> generateLine(int userSize) {
        points = new ArrayList<>();
        for (int i = 0; i < userSize; i++) {
            points.add(RandomValueGenerator.generateRandomValue());
        }
        return points;
    }

    public static LadderGame of(int userNum) {
        return new LadderGame(userNum);
    }

    public LadderGameDto run(int LadderHeight) {
        for (int i = 0; i < LadderHeight - 1; i++) {
            ladder.add(generateLine(points.size()));
        }
        return LadderGameDto();
    }

    public LadderGameDto LadderGameDto() {
        return LadderGameDto.ofLadder(ladder);
    }
}
