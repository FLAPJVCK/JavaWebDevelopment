package by.epamtc.VaskevichArtsiom.task01.task6;

import java.util.Scanner;

public class service {
    public static int scanNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            if (number <= 0 || number > 86400){
                throw new ArithmeticException();
            }
        } else {
            throw new ArithmeticException();
        }
        return number;
    }

    public static int[] timeCounter(int nSeconds){
        int hour, minute, second;
        hour = nSeconds / 3600;
        minute = (nSeconds - (hour * 3600)) / 60;
        second = nSeconds - (hour * 3600) - (minute * 60);
        return new int[]{hour, minute, second};
    }

}
