package by.epamtc.VaskevichArtsiom.task01.task05;

public class Service {
    public static final int[] PERFECT_NUMBERS = {6, 28, 496, 8128, 33550336};

    public static boolean isIntegerPerfect(int number) {
        boolean result = false;
        if ((number == PERFECT_NUMBERS[0]) || (number == PERFECT_NUMBERS[1]) || (number == PERFECT_NUMBERS[2]) ||
                (number == PERFECT_NUMBERS[3]) || (number == PERFECT_NUMBERS[4])) {
            result = true;
        }
        return result;
    }
}
