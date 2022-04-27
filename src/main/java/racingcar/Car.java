package racingcar;

public class Car {
    private String name;
    private String location = "-";

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }

        this.name = name;
    }

    public void forward(int num) {
        if (num >= 4) {
            this.location += "-";
        }
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }
}
