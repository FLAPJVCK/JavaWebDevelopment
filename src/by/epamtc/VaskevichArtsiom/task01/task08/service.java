package by.epamtc.VaskevichArtsiom.task01.task08;

import java.util.Scanner;

public class service {
    public static double scanNumber(){
        double number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            number = scanner.nextDouble();
            return number;
        } else {
            throw new ArithmeticException();
        }
    }

    public static double getFunctionValue(double x){
        double result;
        if (x >= 3){
            result = (-(Math.pow(x, 2))) + (3 * x) + 9;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
        return result;
    }
}
