package by.epamtc.VaskevichArtsiom.task01.task02;

public class Service {
    public static final int FOUR_YEARS = 4;
    public static final int CENTURY = 100;

    public static int daysInMonth(int year, int month) {
        int numberOfDays;
        switch (month) {
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
            default:
                throw new ArithmeticException();
        }
        return numberOfDays;
    }

    public static int isItLeapYear(int year) {
        int daysInFebruary = 28;
        if (year % FOUR_YEARS == 0) {
            if ((year % CENTURY != 0) || (year % (FOUR_YEARS * CENTURY) == 0)) {
                daysInFebruary = 29;
            }
        }
        return daysInFebruary;
    }
}
