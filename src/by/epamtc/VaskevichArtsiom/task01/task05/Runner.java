package by.epamtc.VaskevichArtsiom.task01.task05;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanNaturalNumber;

public class Runner {
    public static void main(String[] args) {
        int number;
        try {
            System.out.println("Input number ");
            number = scanNaturalNumber();
            System.out.println(Service.isIntegerPerfect(number));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
