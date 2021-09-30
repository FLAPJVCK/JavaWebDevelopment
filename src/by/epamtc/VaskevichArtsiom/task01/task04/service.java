package by.epamtc.VaskevichArtsiom.task01.task04;

import java.util.Scanner;

public class service {
    public static int scanNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            return number;
        } else {
            throw new ArithmeticException();
        }
    }

    public static boolean comparisonNumbers (int a, int b, int c, int d){
        boolean result = false;
        if ((a & 1) + (b & 1) + (c & 1) + (d & 1) < 3){
            result = true;
        }
        return result;
    }
}
