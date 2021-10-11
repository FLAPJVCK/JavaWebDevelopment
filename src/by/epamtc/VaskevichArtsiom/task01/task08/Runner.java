package by.epamtc.VaskevichArtsiom.task01.task08;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanDoubleNumber;

public class Runner {
    public static void main(String[] args) {
        double x;
        try {
            System.out.println("Input x ");
            x = scanDoubleNumber();
            System.out.println("Function value = " + Service.calculateFunctionValue(x));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
