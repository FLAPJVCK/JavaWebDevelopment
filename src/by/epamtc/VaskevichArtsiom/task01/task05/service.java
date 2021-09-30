package by.epamtc.VaskevichArtsiom.task01.task05;

import java.util.Scanner;

public class service {
    public static int scanNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            if (number <= 0){
                throw new ArithmeticException();
            }
        } else {
            throw new ArithmeticException();
        }
        return number;
    }

    public static boolean isIntegerPerfect (int number){
        boolean result = false;
        if ((number == 6) || (number == 28) || (number == 496) || (number == 8128) || (number == 33550336)){
            result = true;
        }
        return result;
    }
}
