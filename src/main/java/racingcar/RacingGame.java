package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private List<Car> cars;

    public RacingGame(List<String> carNames) {
        this.cars = carNames.stream()
                .map(x -> x.trim())
                .map(x -> new Car(x))
                .collect(Collectors.toList());
    }

    public void gameRound() {
        for (Car car : cars) {
            int random = Randoms.pickNumberInRange(0, 9);
            car.move(random);
        }
    }

    public int findPosition(){
        int maxValue = 0;
        for(Car car : cars){
            maxValue = Math.max(maxValue, car.getPosition());
        }
        return maxValue;
    }

    public List<Car> winner(){
        int winnerPosition = findPosition();
        return cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
