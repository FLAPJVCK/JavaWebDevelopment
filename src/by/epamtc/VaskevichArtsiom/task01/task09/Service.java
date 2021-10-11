package by.epamtc.VaskevichArtsiom.task01.task09;

public class Service {
    public static double findCircleLength(double R) {
        double result;
        result = 2 * Math.PI * R;
        return result;
    }

    public static double findCircleArea(double R) {
        double result;
        result = Math.PI * Math.pow(R, 2);
        return result;
    }
}
