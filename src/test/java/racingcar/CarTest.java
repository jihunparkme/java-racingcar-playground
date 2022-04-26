package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

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
}
