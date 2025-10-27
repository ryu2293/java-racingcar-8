package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingGameTest {

    @Test
    @DisplayName("가장 많이 이동한 자동차가 우승한다.")
    void car_max_move() {

        RacingGame game = new RacingGame(List.of("pobi", "woni"));

        Car pobi = game.getCars().get(0);
        pobi.move(9);
        pobi.move(9);

        Car woni = game.getCars().get(1);
        woni.move(9);

        List<Car> winner = game.winner();
        assertThat(winner.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("가장 많이 이동한 자동차가 2개이면 2개 모두 우승한다.")
    void cars_max_move() {

        RacingGame game = new RacingGame(List.of("pobi", "woni", "jun"));

        Car pobi = game.getCars().get(0);
        pobi.move(9);
        pobi.move(9);

        Car woni = game.getCars().get(1);
        woni.move(9);

        Car jun = game.getCars().get(2);
        jun.move(9);
        jun.move(9);

        List<Car> winner = game.winner();
        assertThat(winner.get(0).getName()).isEqualTo("pobi");
        assertThat(winner.get(1).getName()).isEqualTo("jun");
    }
}
