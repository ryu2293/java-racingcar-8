package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = UserInput.inputCarName();
        int tryCount = UserInput.tryCount();

        RacingGame game = new RacingGame(carNames);
        for (int i = 0; i < tryCount; i++) {
            game.gameRound();
            Output.printRound(game.getCars());
        }

        List<Car> winner = game.winner();
        Output.printWinner(winner);
    }
}
