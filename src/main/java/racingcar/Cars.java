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

    public List<String> getWinners() {
        int maxScore = getMaxScore();
        List<String> result = new ArrayList<>();
        for (Car car : this.carList) {
            if (car.getLocation().length() == maxScore) {
                result.add(car.getName());
            }
        }

        return result;
    }

    private int getMaxScore() {
        int result = 0;
        for (Car car : this.carList) {
            result = Math.max(result, car.getLocation().length());
        }

        return result;
    }
}
