package racingcar.dto;

import java.util.ArrayList;
import java.util.List;

public class RacingGameDto {
    private List<CarDto> carPositions = new ArrayList<>();

    public void setCarPositions(CarDto carDto) {
        carPositions.add(carDto);
    }

    public List<CarDto> getCarPositions() {
        return carPositions;
    }
}
