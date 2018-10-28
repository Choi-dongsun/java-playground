package racingcar.domain;

import racingcar.dto.CarDto;

public class Car {
    private int position;

    public Car(int position) {
        this.position = position;
    }

    public void movePosition(int num){
        if (num >= 4) this.position++;
    }

    public CarDto CarDto() {
        return new CarDto(position);
    }
}
