package ladder;

import ladder.domain.LadderGame;
import ladder.dto.LadderGameDto;
import ladder.view.InputView;
import ladder.view.ResultView;

public class Main {
    public static void main(String[] args) {
        int userNum = InputView.getUserNum();
        int ladderHeight = InputView.getladderHeight();

        LadderGame ladderGame = LadderGame.of(userNum);
        LadderGameDto result = ladderGame.run(ladderHeight);

        ResultView.printResult(result);
    }
}
