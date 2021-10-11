package by.epamtc.VaskevichArtsiom.task01.task02;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanPositiveIntegerNumber;

public class Runner {
    public static void main(String[] args) {
        int year, month, daysInMonth;
        try {
            System.out.print("Input year ");
            year = scanPositiveIntegerNumber();
            System.out.print("Input the month number ");
            month = scanPositiveIntegerNumber();
            daysInMonth = Service.daysInMonth(year, month);
            System.out.println("In the " + month + " month of " + year + " the number of days: " + daysInMonth);
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
