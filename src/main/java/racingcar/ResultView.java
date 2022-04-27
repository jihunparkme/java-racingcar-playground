package racingcar;

import java.util.List;

public class ResultView {
    public void printResult(Cars cars) {
        System.out.println("\n실행 결과");
        for (Car car : cars.getCarList()) {
            System.out.println(car.getName() + " : " + car.getLocation());
        }
    }

    public void printWinner(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        sb.append(winners.get(0));
        for (int i = 1; i < winners.size(); i++) {
            sb.append(", ").append(winners.get(i));
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb.toString());
    }
}
