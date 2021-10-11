package by.epamtc.VaskevichArtsiom.task01.task01;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanLongNumber;

public class Runner {
    public static void main(String[] args) {
        long number;
        try {
            System.out.print("Input number ");
            number = scanLongNumber();
            number = Service.lastSquareNumber(number);
            System.out.println("Last number of square number is " + number);
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
