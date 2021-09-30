package by.epamtc.VaskevichArtsiom.task01.task01;

import java.util.Scanner;

public class service {
    public static long scanNumber(){
        long number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong()){
            number = scanner.nextLong();
            return number;
        } else {
            throw new ArithmeticException();
        }
    }

    public static long lastSquareNumber(long num){
        long result;
        result = num % 10;
        result *= result;
        result %= 10;
        return result;
    }
}
