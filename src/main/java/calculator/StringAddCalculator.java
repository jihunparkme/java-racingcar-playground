package calculator;

public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (text == null) {
            return 0;
        }

        if (text.isEmpty()) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        return 0;
    }
}
