package by.epamtc.VaskevichArtsiom.task01.task04;

public class Service {
    public static boolean comparisonNumbers(int a, int b, int c, int d) {
        boolean result = false;
        if ((a & 1) + (b & 1) + (c & 1) + (d & 1) < 3) {
            result = true;
        }
        return result;
    }
}
