package kapitel01;

import java.util.List;

public class TipCalculator {

    public static int getTipPercentage(List<String> names) {
        if (names.size() > 5) {
            return 20;
        }

        if (!names.isEmpty()) {
            return 10;
        }

        return 0;
    }

    public static double calculateTip(List<String> names, double amount) {
        return amount * getTipPercentage(names) / 100.0;
    }
}
