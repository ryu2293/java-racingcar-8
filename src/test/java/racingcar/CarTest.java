package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차는 이름을 가진다")
    void car_create_test() {
        Car car = new Car("pobi");
        var name = car.getName();
        assertThat(name).isEqualTo("pobi");
    }

    @Test
    @DisplayName("자동차는 값이 4~9일 경우 전진한다")
    void car_move_test() {
        Car car = new Car("pobi");

        car.move(4);
        car.move(9);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차는 값이 0~3일 경우 멈춘다")
    void car_stop_test() {
        Car car = new Car("pobi");

        car.move(0);
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
