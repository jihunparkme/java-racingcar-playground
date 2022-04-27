package racingcar;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        Cars cars = inputView.getCars();
        int count = inputView.getCount();
        for (int i = 0; i < count; i++) {
            for (Car car : cars.getCarList()) {
                int accel = new Random().nextInt(9) + 1;
                car.forward(accel);
            }

            resultView.printResult(cars);
        }

        resultView.printWinner(cars.getWinners());
    }
}
