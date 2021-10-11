package by.epamtc.VaskevichArtsiom.task01.task10;

public class Service {
    public static double[][] calculateValues(double a, double b, double h) {
        double[][] results = new double[2][];
        double y, i;
        int j, arraySize = 0;
        for (i = a; i <= b; i += h) {
            arraySize += 1;
        }
        results[0] = new double[arraySize];
        results[1] = new double[arraySize];
        for (i = a, j = 0; i <= b; i += h, j++) {
            y = Math.tan(i);
            results[0][j] = i;
            results[1][j] = y;
        }
        return results;
    }
}
