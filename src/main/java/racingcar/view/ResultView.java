package racingcar.view;

import racingcar.dto.CarDto;
import racingcar.dto.RacingGameDto;
import java.util.List;

public class ResultView {
    public static void printResult(RacingGameDto result) {
        List<CarDto> carPositions = result.getCarPositions();
        System.out.println("실행결과");
        for (CarDto car : carPositions) {
            printEachCarResult(car);
            System.out.println();
        }
    }

    private static void printEachCarResult(CarDto car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.printf("-");
        }
    }
}
