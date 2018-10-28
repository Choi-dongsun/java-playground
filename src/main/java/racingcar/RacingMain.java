package racingcar;

import racingcar.domain.RacingGame;
import racingcar.dto.RacingGameDto;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingMain {
    public static void main(String[] args) {
        String CarName = InputView.getCarNum();
        RacingGame racingGame = RacingGame.ofcarName(CarName);

        int GameCount = InputView.getGameCount();
        RacingGameDto result = racingGame.race(GameCount);

        ResultView.printResult(result);
    }
}
