package racingcar;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public Cars getCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = scanner.nextLine();

        return new Cars(input);
    }

    public int getCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = scanner.nextLine();

        return Integer.parseInt(input);
    }
}
