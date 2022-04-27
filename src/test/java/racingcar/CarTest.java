package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("자동차 이름이 5글자를 초과할 경우 예외처리")
    void car_name_length_greater_than_5() {
        assertThatThrownBy(() -> {
            new Car("aaron1");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("자동차 이름은 쉼표를 기준으로 구분")
    void separate_car_name_commas() {
        Cars cars = new Cars("pobi,crong,honux");
        List<Car> carList = cars.getCarList();
        assertThat(carList.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("0에서 9 사이 random 값이 4이상일 경우 전진")
    void forward_if_0_to_9() {
        Car car = new Car("aaron");
        car.forward(4);
        assertThat(car.getLocation()).isEqualTo("--");
        car.forward(9);
        assertThat(car.getLocation()).isEqualTo("---");
    }

    @Test
    @DisplayName("0에서 9 사이 random 값이 4미만일 경우")
    void forward_if_not_0_to_9() {
        Car car = new Car("aaron");
        car.forward(0);
        assertThat(car.getLocation()).isEqualTo("-");
        car.forward(3);
        assertThat(car.getLocation()).isEqualTo("-");
    }

    @Test
    @DisplayName("우승자는 한 명")
    void only_one_winner() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.getCarList().get(0).forward(5);

        List<String> winners = cars.getWinners();
        assertThat(winners).contains("pobi");
    }

    @Test
    @DisplayName("우승자가 한 명 이상")
    void more_than_one_winner() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.getCarList().get(0).forward(5);
        cars.getCarList().get(2).forward(5);

        List<String> winners = cars.getWinners();
        assertThat(winners).contains("pobi", "honux");
    }
}