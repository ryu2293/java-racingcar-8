package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Output {
    public static void printRound(List<Car> cars) {
        for (Car car : cars) {
            int cnt = 0;
            StringBuilder bar = new StringBuilder();
            while (cnt < car.getPosition()) {
                bar.append("-");
                cnt++;
            }
            System.out.println(car.getName() + " : " + bar);
        }
        System.out.println();
    }

    public static void printWinner(List<Car> winner) {
        var result = winner.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
        String winnerName = String.join(", ", result);
        System.out.println("최종 우승자 : " + winnerName);
    }
}
