package ladder.dto;

import java.util.List;

public class LadderGameDto {
    private List<List<Boolean>> ladder;

    private LadderGameDto(List<List<Boolean>> ladder) {
        this.ladder = ladder;
    }

    public static LadderGameDto ofLadder(List<List<Boolean>> ladder) {
        return new LadderGameDto(ladder);
    }

    public List<List<Boolean>> getLadder() {
        return ladder;
    }
}
