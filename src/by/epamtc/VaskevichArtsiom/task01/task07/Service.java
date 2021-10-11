package by.epamtc.VaskevichArtsiom.task01.task07;

public class Service {
    public static String pointComparison(int x1, int y1, int x2, int y2) {
        double z1, z2, result;
        z1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        z2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        result = z1 - z2;
        if (result < 0) {
            return "A";
        } else if (result > 0) {
            return "B";
        } else return "Equal";
    }
}
