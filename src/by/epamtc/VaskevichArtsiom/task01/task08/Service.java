package by.epamtc.VaskevichArtsiom.task01.task08;

public class Service {
    public static double calculateFunctionValue(double x) {
        double result;
        if (x >= 3) {
            result = (-(Math.pow(x, 2))) + (3 * x) + 9;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
        return result;
    }
}
