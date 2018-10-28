package racingcar.domain;

import racingcar.dto.RacingGameDto;
import racingcar.utils.RandomValueGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int carNum;
    private List<Car> carPositions = new ArrayList<>();

    public RacingGame(int carNum) {
        this.carNum = carNum;
        for (int i = 0; i < carNum ; i++) carPositions.add(new Car(0));
    }

    public RacingGameDto racing(int count) {
        for (int i = 0; i < count; i++) {
            moveCar();
        }
        return RacingGameDto();
    }

    private void moveCar() {
        for (Car car : carPositions) {
            car.movePosition(RandomValueGenerator.generateRandonNum());
        }
    }

    public RacingGameDto RacingGameDto() {
        RacingGameDto result = new RacingGameDto();
        for (Car car : carPositions) {
            result.setCarPositions(car.CarDto());
        }
        return result;
    }
}
