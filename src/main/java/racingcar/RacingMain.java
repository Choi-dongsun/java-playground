package racingcar;

import racingcar.domain.RacingGame;
import racingcar.dto.RacingGameDto;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingMain {
    public static void main(String[] args) {
        int CarNum = InputView.getCarNum();
        int GameCount = InputView.getGameCount();

        RacingGame racingGame = new RacingGame(CarNum);
        RacingGameDto result = racingGame.racing(GameCount);

        ResultView.printResult(result);
    }
}
