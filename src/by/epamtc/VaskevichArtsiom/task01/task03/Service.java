package by.epamtc.VaskevichArtsiom.task01.task03;

public class Service {
    public static double circleInSquareDiameter(double squareArea) {
        double circleDiameter;
        circleDiameter = Math.sqrt(squareArea);
        return circleDiameter;
    }

    public static double squareInCircleArea(double circleDiameter) {
        double squareArea;
        squareArea = Math.pow(circleDiameter, 2) / 2;
        return squareArea;
    }

    public static double compareTwoSquaresArea(double square1, double square2) {
        double result;
        result = square1 / square2;
        return result;
    }

}
