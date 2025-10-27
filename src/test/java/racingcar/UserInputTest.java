package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class UserInputTest {

    @Test
    @DisplayName("자동차 이름이 5이상이면 예외 발생")
    void car_name_length(){
        String input = "pobi, woniwoni";

        assertThatThrownBy(() -> UserInput.checkCarName(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름이 빈 값이면 예외 발생")
    void car_name_empty(){
        String input = "pobi,,woni";

        assertThatThrownBy(() -> UserInput.checkCarName(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("시도 횟수가 숫자가 아니면 예외 발생")
    void try_count_number(){
        String input = "a";

        assertThatThrownBy(() -> UserInput.checkTryCount(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("시도 횟수가 1보다 작으면 예외 발생")
    void try_count_less_that_one(){
        String input = "0";

        assertThatThrownBy(() -> UserInput.checkTryCount(input)).isInstanceOf(IllegalArgumentException.class);
    }
}
