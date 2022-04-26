package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    public Cars(String text) {
        String[] splitText = text.split(",");
        for (int i = 0; i < splitText.length; i++) {
            carList.add(new Car(splitText[i]));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
