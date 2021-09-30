package by.epamtc.VaskevichArtsiom.task01.task2;

import java.util.Scanner;

public class service {
    public static int scanNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            number = scanner.nextInt();
            if (number < 0){
                throw new ArithmeticException();
            }
        } else {
            throw new ArithmeticException();
        }
        return number;
    }

    public static int daysInMonth (int year, int month){
        int numberOfDays;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = isItLeapYear(year);
                break;
            default: throw new ArithmeticException();
        }
        return numberOfDays;
    }

    public static int isItLeapYear(int year){
        int daysInFebruary = 28;
        if (year % 4 == 0){
            if ((year % 100 != 0) || (year % 400 == 0)){
                daysInFebruary = 29;
            }
        }
        return daysInFebruary;
    }
}
