package by.epamtc.VaskevichArtsiom.task01.task01;

public class Service {
    public static long lastSquareNumber(long num) {
        long result;
        result = num % 10;
        result *= result;
        result %= 10;
        return result;
    }
}
