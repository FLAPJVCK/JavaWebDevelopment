package by.epamtc.VaskevichArtsiom.task01.task9;

import java.util.Scanner;

public class service {
    public static double scanNumber(){
        double number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            number = scanner.nextDouble();
            if (number <= 0){
                throw new ArithmeticException();
            }
        } else {
            throw new ArithmeticException();
        }
        return number;
    }

    public static double findCircleLength(double R){
        double result;
        result = 2 * Math.PI * R;
        return result;
    }

    public static double findCircleArea(double R){
        double result;
        result = Math.PI * Math.pow(R, 2);
        return result;
    }
}
